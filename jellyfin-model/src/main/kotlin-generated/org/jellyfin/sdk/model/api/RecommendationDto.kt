// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.UUIDSerializer

@Serializable
public data class RecommendationDto(
	@SerialName("Items")
	public val items: List<BaseItemDto>? = null,
	@SerialName("RecommendationType")
	public val recommendationType: RecommendationType,
	@SerialName("BaselineItemName")
	public val baselineItemName: String? = null,
	@SerialName("CategoryId")
	public val categoryId: UUID
)
