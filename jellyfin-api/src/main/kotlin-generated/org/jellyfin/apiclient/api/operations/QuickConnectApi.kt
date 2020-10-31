// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.QuickConnectResult
import org.jellyfin.apiclient.model.api.QuickConnectState

public class QuickConnectApi(
	private val api: KtorClient
) {
	/**
	 * Temporarily activates quick connect for five minutes.
	 */
	public suspend fun activate(): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<Unit>("/QuickConnect/Activate", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Authorizes a pending quick connect request.
	 *
	 * @param code Quick connect code to authorize.
	 */
	public suspend fun authorize(code: String): Response<Boolean> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["code"] = code
		val data = null
		val response = api.post<Boolean>("/QuickConnect/Authorize", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Enables or disables quick connect.
	 *
	 * @param status New MediaBrowser.Model.QuickConnect.QuickConnectState.
	 */
	public suspend fun available(status: QuickConnectState): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["status"] = status
		val data = null
		val response = api.post<Unit>("/QuickConnect/Available", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Attempts to retrieve authentication information.
	 *
	 * @param secret Secret previously returned from the Initiate endpoint.
	 */
	public suspend fun connect(secret: String): Response<QuickConnectResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["secret"] = secret
		val data = null
		val response = api.`get`<QuickConnectResult>("/QuickConnect/Connect", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Deauthorize all quick connect devices for the current user.
	 */
	public suspend fun deauthorize(): Response<Int> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<Int>("/QuickConnect/Deauthorize", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Initiate a new quick connect request.
	 */
	public suspend fun initiate(): Response<QuickConnectResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<QuickConnectResult>("/QuickConnect/Initiate", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets the current quick connect state.
	 */
	public suspend fun getStatus(): Response<QuickConnectState> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<QuickConnectState>("/QuickConnect/Status", pathParameters,
				queryParameters, data)
		return response
	}
}
