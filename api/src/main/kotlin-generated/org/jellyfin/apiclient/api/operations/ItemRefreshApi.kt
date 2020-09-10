// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.MetadataRefreshMode

class ItemRefreshApi(
	private val api: KtorClient
) {
	/**
	 * Refreshes metadata for an item.
	 *
	 * @param itemId Item id.
	 * @param metadataRefreshMode (Optional) Specifies the metadata refresh mode.
	 * @param imageRefreshMode (Optional) Specifies the image refresh mode.
	 * @param replaceAllMetadata (Optional) Determines if metadata should be replaced. Only applicable
	 * if mode is FullRefresh.
	 * @param replaceAllImages (Optional) Determines if images should be replaced. Only applicable if
	 * mode is FullRefresh.
	 */
	suspend fun post(
		itemId: UUID,
		metadataRefreshMode: MetadataRefreshMode,
		imageRefreshMode: MetadataRefreshMode,
		replaceAllMetadata: Boolean,
		replaceAllImages: Boolean
	): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["metadataRefreshMode"] = metadataRefreshMode
		queryParameters["imageRefreshMode"] = imageRefreshMode
		queryParameters["replaceAllMetadata"] = replaceAllMetadata
		queryParameters["replaceAllImages"] = replaceAllImages
		val data = null
		val response = api.post<Unit>("/Items/{itemId}/Refresh", pathParameters, queryParameters, data)
		return response
	}
}
