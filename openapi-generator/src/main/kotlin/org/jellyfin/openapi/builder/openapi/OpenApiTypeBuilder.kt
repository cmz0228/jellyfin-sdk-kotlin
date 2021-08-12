package org.jellyfin.openapi.builder.openapi

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import com.squareup.kotlinpoet.TypeName
import io.swagger.v3.oas.models.media.*
import net.pearx.kasechange.CaseFormat
import net.pearx.kasechange.toPascalCase
import org.jellyfin.openapi.OpenApiGeneratorError
import org.jellyfin.openapi.constants.Packages
import org.jellyfin.openapi.constants.Types
import org.jellyfin.openapi.hooks.ApiTypePath
import org.jellyfin.openapi.hooks.TypeBuilderHook
import org.jellyfin.openapi.hooks.TypePath

class OpenApiTypeBuilder(
	private val hooks: Collection<TypeBuilderHook>,
) {
	fun build(path: TypePath, schema: Schema<*>): TypeName =
		buildWithHooks(path, schema) ?: buildSchema(path, schema)

	private fun buildWithHooks(path: TypePath, data: Schema<*>): TypeName? {
		for (hook in hooks) {
			val result = hook.onBuildType(path, data, this)
			if (result != null) return result
		}

		return null
	}

	@Suppress("ComplexMethod")
	fun buildSchema(path: TypePath, schema: Schema<*>): TypeName = when {
		// Use referenced type
		schema.`$ref` != null -> buildReference(schema.`$ref`)
		// Use type based on schema class
		else -> when (schema) {
			// Primitives
			is StringSchema -> buildString()
			is BooleanSchema -> buildBoolean()
			// Numbers (will base the type on "format")
			is NumberSchema -> buildNumber(schema)
			is IntegerSchema -> buildNumber(schema)
			// Time
			is DateTimeSchema -> buildDateTime()
			// UUID
			is UUIDSchema -> buildUUIDType()
			// Binary
			is BinarySchema -> buildBinary()
			// Collections
			is ArraySchema -> buildArrayType(path, schema)
			is MapSchema -> buildMapType(path, schema)
			// Composed
			is ComposedSchema -> when {
				// Limited support for anyOf / allOf containing a single item
				schema.anyOf?.size == 1 -> buildSchema(path, schema.anyOf.first())
				schema.allOf?.size == 1 -> buildSchema(path, schema.allOf.first())
				else -> throw UnknownTypeError(schema.type, schema.format)
			}
			else -> throw UnknownTypeError(schema.type, schema.format)
		}.copy(
			// Add nullability
			nullable = schema.nullable ?: false,
			// Remove tags when set
			tags = emptyMap()
		)
	}

	fun buildNumber(schema: Schema<*>) = when (schema.format) {
		"int32" -> Types.INT
		"int64" -> Types.LONG
		"double" -> Types.DOUBLE
		"float" -> Types.FLOAT
		else -> throw UnknownTypeError(schema.type, schema.format)
	}

	fun buildString() = Types.STRING
	fun buildBoolean() = Types.BOOLEAN
	fun buildDateTime() = Types.DATETIME
	fun buildUUIDType() = Types.UUID

	fun buildArrayType(path: TypePath, schema: ArraySchema): ParameterizedTypeName {
		val type = when {
			// Parameters in API operations use less-strict Collection interface
			path is ApiTypePath && path.isParameterType() -> Types.COLLECTION
			// Everything else uses stricter List interface
			else -> Types.LIST
		}

		return type.plusParameter(buildSchema(path, schema.items as Schema<*>))
	}

	fun buildMapType(path: TypePath, schema: MapSchema) = Types.MAP
		.plusParameter(Types.STRING)
		.plusParameter(buildSchema(path, schema.additionalProperties as Schema<*>))

	fun buildReference(reference: String) = ClassName(
		Packages.MODEL,
		reference
			.removePrefix("#/components/schemas/")
			.toPascalCase(from = CaseFormat.CAPITALIZED_CAMEL)
	)

	fun buildBinary() = Types.BINARY

	class UnknownTypeError(
		type: String?,
		format: String?,
	) : OpenApiGeneratorError("Unknown type $type with format $format")
}
