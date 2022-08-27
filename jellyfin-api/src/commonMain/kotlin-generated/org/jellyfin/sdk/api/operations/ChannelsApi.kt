// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.buildMap
import kotlin.collections.emptyList
import kotlin.collections.emptyMap
import org.jellyfin.sdk.api.client.ApiClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.api.client.extensions.`get`
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.api.BaseItemDtoQueryResult
import org.jellyfin.sdk.model.api.ChannelFeatures
import org.jellyfin.sdk.model.api.ItemFields
import org.jellyfin.sdk.model.api.ItemFilter
import org.jellyfin.sdk.model.api.SortOrder
import org.jellyfin.sdk.model.api.request.GetChannelItemsRequest
import org.jellyfin.sdk.model.api.request.GetChannelsRequest
import org.jellyfin.sdk.model.api.request.GetLatestChannelItemsRequest

public class ChannelsApi(
	private val api: ApiClient,
) : Api {
	/**
	 * Get all channel features.
	 */
	public suspend fun getAllChannelFeatures(): Response<List<ChannelFeatures>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<ChannelFeatures>>("/Channels/Features", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get channel features.
	 *
	 * @param channelId Channel id.
	 */
	public suspend fun getChannelFeatures(channelId: UUID): Response<ChannelFeatures> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("channelId", channelId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<ChannelFeatures>("/Channels/{channelId}/Features", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get channel items.
	 *
	 * @param channelId Channel Id.
	 * @param folderId Optional. Folder Id.
	 * @param userId Optional. User Id.
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param sortOrder Optional. Sort Order - Ascending,Descending.
	 * @param filters Optional. Specify additional filters to apply.
	 * @param sortBy Optional. Specify one or more sort orders, comma delimited. Options: Album,
	 * AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount,
	 * PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 */
	public suspend fun getChannelItems(
		channelId: UUID,
		folderId: UUID? = null,
		userId: UUID? = null,
		startIndex: Int? = null,
		limit: Int? = null,
		sortOrder: Collection<SortOrder>? = emptyList(),
		filters: Collection<ItemFilter>? = emptyList(),
		sortBy: Collection<String>? = emptyList(),
		fields: Collection<ItemFields>? = emptyList(),
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("channelId", channelId)
		}
		val queryParameters = buildMap<String, Any?>(8) {
			put("folderId", folderId)
			put("userId", userId)
			put("startIndex", startIndex)
			put("limit", limit)
			put("sortOrder", sortOrder)
			put("filters", filters)
			put("sortBy", sortBy)
			put("fields", fields)
		}
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Channels/{channelId}/Items", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get channel items.
	 *
	 * @param request The request paramaters
	 */
	public suspend fun getChannelItems(request: GetChannelItemsRequest):
			Response<BaseItemDtoQueryResult> = getChannelItems(
		channelId = request.channelId,
		folderId = request.folderId,
		userId = request.userId,
		startIndex = request.startIndex,
		limit = request.limit,
		sortOrder = request.sortOrder,
		filters = request.filters,
		sortBy = request.sortBy,
		fields = request.fields,
	)

	/**
	 * Gets available channels.
	 *
	 * @param userId User Id to filter by. Use System.Guid.Empty to not filter by user.
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param supportsLatestItems Optional. Filter by channels that support getting latest items.
	 * @param supportsMediaDeletion Optional. Filter by channels that support media deletion.
	 * @param isFavorite Optional. Filter by channels that are favorite.
	 */
	public suspend fun getChannels(
		userId: UUID? = null,
		startIndex: Int? = null,
		limit: Int? = null,
		supportsLatestItems: Boolean? = null,
		supportsMediaDeletion: Boolean? = null,
		isFavorite: Boolean? = null,
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = buildMap<String, Any?>(6) {
			put("userId", userId)
			put("startIndex", startIndex)
			put("limit", limit)
			put("supportsLatestItems", supportsLatestItems)
			put("supportsMediaDeletion", supportsMediaDeletion)
			put("isFavorite", isFavorite)
		}
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Channels", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Gets available channels.
	 *
	 * @param request The request paramaters
	 */
	public suspend fun getChannels(request: GetChannelsRequest = GetChannelsRequest()):
			Response<BaseItemDtoQueryResult> = getChannels(
		userId = request.userId,
		startIndex = request.startIndex,
		limit = request.limit,
		supportsLatestItems = request.supportsLatestItems,
		supportsMediaDeletion = request.supportsMediaDeletion,
		isFavorite = request.isFavorite,
	)

	/**
	 * Gets latest channel items.
	 *
	 * @param userId Optional. User Id.
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param filters Optional. Specify additional filters to apply.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param channelIds Optional. Specify one or more channel id's, comma delimited.
	 */
	public suspend fun getLatestChannelItems(
		userId: UUID? = null,
		startIndex: Int? = null,
		limit: Int? = null,
		filters: Collection<ItemFilter>? = emptyList(),
		fields: Collection<ItemFields>? = emptyList(),
		channelIds: Collection<UUID>? = emptyList(),
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = buildMap<String, Any?>(6) {
			put("userId", userId)
			put("startIndex", startIndex)
			put("limit", limit)
			put("filters", filters)
			put("fields", fields)
			put("channelIds", channelIds)
		}
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Channels/Items/Latest", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets latest channel items.
	 *
	 * @param request The request paramaters
	 */
	public suspend fun getLatestChannelItems(request: GetLatestChannelItemsRequest =
			GetLatestChannelItemsRequest()): Response<BaseItemDtoQueryResult> = getLatestChannelItems(
		userId = request.userId,
		startIndex = request.startIndex,
		limit = request.limit,
		filters = request.filters,
		fields = request.fields,
		channelIds = request.channelIds,
	)
}
