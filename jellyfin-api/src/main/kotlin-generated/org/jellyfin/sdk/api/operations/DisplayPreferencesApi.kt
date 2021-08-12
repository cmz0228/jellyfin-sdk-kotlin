// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.mutableMapOf
import org.jellyfin.sdk.api.client.KtorClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.api.client.exception.MissingUserIdException
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.api.DisplayPreferencesDto

public class DisplayPreferencesApi(
	private val api: KtorClient
) {
	/**
	 * Get Display Preferences.
	 *
	 * @param displayPreferencesId Display preferences id.
	 * @param userId User id.
	 * @param client Client.
	 */
	public suspend fun getDisplayPreferences(
		displayPreferencesId: String,
		userId: UUID = api.userId ?: throw MissingUserIdException(),
		client: String
	): Response<DisplayPreferencesDto> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["displayPreferencesId"] = displayPreferencesId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["client"] = client
		val data = null
		val response = api.`get`<DisplayPreferencesDto>("/DisplayPreferences/{displayPreferencesId}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Update Display Preferences.
	 *
	 * @param displayPreferencesId Display preferences id.
	 * @param userId User Id.
	 * @param client Client.
	 */
	public suspend fun updateDisplayPreferences(
		displayPreferencesId: String,
		userId: UUID = api.userId ?: throw MissingUserIdException(),
		client: String,
		`data`: DisplayPreferencesDto
	): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["displayPreferencesId"] = displayPreferencesId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["client"] = client
		val response = api.post<Unit>("/DisplayPreferences/{displayPreferencesId}", pathParameters,
				queryParameters, data)
		return response
	}
}
