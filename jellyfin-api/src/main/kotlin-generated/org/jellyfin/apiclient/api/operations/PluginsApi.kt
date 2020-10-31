// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.BasePluginConfiguration
import org.jellyfin.apiclient.model.api.MbRegistrationRecord
import org.jellyfin.apiclient.model.api.PluginInfo
import org.jellyfin.apiclient.model.api.PluginSecurityInfo

public class PluginsApi(
	private val api: KtorClient
) {
	/**
	 * Gets a list of currently installed plugins.
	 */
	public suspend fun getPlugins(): Response<List<PluginInfo>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<PluginInfo>>("/Plugins", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Uninstalls a plugin.
	 *
	 * @param pluginId Plugin id.
	 */
	public suspend fun uninstallPlugin(pluginId: UUID): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["pluginId"] = pluginId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.delete<Unit>("/Plugins/{pluginId}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets plugin configuration.
	 *
	 * @param pluginId Plugin id.
	 */
	public suspend fun getPluginConfiguration(pluginId: UUID): Response<BasePluginConfiguration> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["pluginId"] = pluginId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<BasePluginConfiguration>("/Plugins/{pluginId}/Configuration",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Accepts plugin configuration as JSON body.
	 *
	 * @param pluginId Plugin id.
	 */
	public suspend fun updatePluginConfiguration(pluginId: UUID): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["pluginId"] = pluginId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<Unit>("/Plugins/{pluginId}/Configuration", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets registration status for a feature.
	 *
	 * @param name Feature name.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getRegistrationStatus(name: String): Response<MbRegistrationRecord> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["name"] = name
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<MbRegistrationRecord>("/Plugins/RegistrationRecords/{name}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets registration status for a feature.
	 *
	 * @param name Feature name.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getRegistration(name: String): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["name"] = name
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<Unit>("/Plugins/Registrations/{name}", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Get plugin security info.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getPluginSecurityInfo(): Response<PluginSecurityInfo> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<PluginSecurityInfo>("/Plugins/SecurityInfo", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Updates plugin security info.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun updatePluginSecurityInfo(`data`: PluginSecurityInfo): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/Plugins/SecurityInfo", pathParameters, queryParameters, data)
		return response
	}
}
