// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.buildMap
import kotlin.collections.emptyList
import kotlin.collections.emptyMap
import org.jellyfin.sdk.api.client.ApiClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.api.client.extensions.`get`
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.api.BaseItemDto
import org.jellyfin.sdk.model.api.BaseItemDtoQueryResult
import org.jellyfin.sdk.model.api.BaseItemKind
import org.jellyfin.sdk.model.api.ImageType
import org.jellyfin.sdk.model.api.ItemFields
import org.jellyfin.sdk.model.api.ItemFilter
import org.jellyfin.sdk.model.api.SortOrder
import org.jellyfin.sdk.model.api.request.GetAlbumArtistsRequest
import org.jellyfin.sdk.model.api.request.GetArtistsRequest

public class ArtistsApi(
	private val api: ApiClient,
) : Api {
	/**
	 * Gets all album artists from a given item, folder, or the entire library.
	 *
	 * @param minCommunityRating Optional filter by minimum community rating.
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param searchTerm Optional. Search term.
	 * @param parentId Specify this to localize the search to a specific item or folder. Omit to use
	 * the root.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param excludeItemTypes Optional. If specified, results will be filtered out based on item type.
	 * This allows multiple, comma delimited.
	 * @param includeItemTypes Optional. If specified, results will be filtered based on item type.
	 * This allows multiple, comma delimited.
	 * @param filters Optional. Specify additional filters to apply.
	 * @param isFavorite Optional filter by items that are marked as favorite, or not.
	 * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited.
	 * @param genres Optional. If specified, results will be filtered based on genre. This allows
	 * multiple, pipe delimited.
	 * @param genreIds Optional. If specified, results will be filtered based on genre id. This allows
	 * multiple, pipe delimited.
	 * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating.
	 * This allows multiple, pipe delimited.
	 * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple,
	 * pipe delimited.
	 * @param years Optional. If specified, results will be filtered based on production year. This
	 * allows multiple, comma delimited.
	 * @param enableUserData Optional, include user data.
	 * @param imageTypeLimit Optional, the max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 * @param person Optional. If specified, results will be filtered to include only those containing
	 * the specified person.
	 * @param personIds Optional. If specified, results will be filtered to include only those
	 * containing the specified person ids.
	 * @param personTypes Optional. If specified, along with Person, results will be filtered to
	 * include only those containing the specified person and PersonType. Allows multiple,
	 * comma-delimited.
	 * @param studios Optional. If specified, results will be filtered based on studio. This allows
	 * multiple, pipe delimited.
	 * @param studioIds Optional. If specified, results will be filtered based on studio id. This
	 * allows multiple, pipe delimited.
	 * @param userId User id.
	 * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater
	 * than a given input string.
	 * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input
	 * string.
	 * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input
	 * string.
	 * @param sortBy Optional. Specify one or more sort orders, comma delimited.
	 * @param sortOrder Sort Order - Ascending,Descending.
	 * @param enableImages Optional, include image information in output.
	 * @param enableTotalRecordCount Total record count.
	 */
	public suspend fun getAlbumArtists(
		minCommunityRating: Double? = null,
		startIndex: Int? = null,
		limit: Int? = null,
		searchTerm: String? = null,
		parentId: UUID? = null,
		fields: Collection<ItemFields>? = emptyList(),
		excludeItemTypes: Collection<BaseItemKind>? = emptyList(),
		includeItemTypes: Collection<BaseItemKind>? = emptyList(),
		filters: Collection<ItemFilter>? = emptyList(),
		isFavorite: Boolean? = null,
		mediaTypes: Collection<String>? = emptyList(),
		genres: Collection<String>? = emptyList(),
		genreIds: Collection<UUID>? = emptyList(),
		officialRatings: Collection<String>? = emptyList(),
		tags: Collection<String>? = emptyList(),
		years: Collection<Int>? = emptyList(),
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: Collection<ImageType>? = emptyList(),
		person: String? = null,
		personIds: Collection<UUID>? = emptyList(),
		personTypes: Collection<String>? = emptyList(),
		studios: Collection<String>? = emptyList(),
		studioIds: Collection<UUID>? = emptyList(),
		userId: UUID? = null,
		nameStartsWithOrGreater: String? = null,
		nameStartsWith: String? = null,
		nameLessThan: String? = null,
		sortBy: Collection<String>? = emptyList(),
		sortOrder: Collection<SortOrder>? = emptyList(),
		enableImages: Boolean? = true,
		enableTotalRecordCount: Boolean? = true,
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = buildMap<String, Any?>(32) {
			put("minCommunityRating", minCommunityRating)
			put("startIndex", startIndex)
			put("limit", limit)
			put("searchTerm", searchTerm)
			put("parentId", parentId)
			put("fields", fields)
			put("excludeItemTypes", excludeItemTypes)
			put("includeItemTypes", includeItemTypes)
			put("filters", filters)
			put("isFavorite", isFavorite)
			put("mediaTypes", mediaTypes)
			put("genres", genres)
			put("genreIds", genreIds)
			put("officialRatings", officialRatings)
			put("tags", tags)
			put("years", years)
			put("enableUserData", enableUserData)
			put("imageTypeLimit", imageTypeLimit)
			put("enableImageTypes", enableImageTypes)
			put("person", person)
			put("personIds", personIds)
			put("personTypes", personTypes)
			put("studios", studios)
			put("studioIds", studioIds)
			put("userId", userId)
			put("nameStartsWithOrGreater", nameStartsWithOrGreater)
			put("nameStartsWith", nameStartsWith)
			put("nameLessThan", nameLessThan)
			put("sortBy", sortBy)
			put("sortOrder", sortOrder)
			put("enableImages", enableImages)
			put("enableTotalRecordCount", enableTotalRecordCount)
		}
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Artists/AlbumArtists", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets all album artists from a given item, folder, or the entire library.
	 *
	 * @param request The request paramaters
	 */
	public suspend fun getAlbumArtists(request: GetAlbumArtistsRequest = GetAlbumArtistsRequest()):
			Response<BaseItemDtoQueryResult> = getAlbumArtists(
		minCommunityRating = request.minCommunityRating,
		startIndex = request.startIndex,
		limit = request.limit,
		searchTerm = request.searchTerm,
		parentId = request.parentId,
		fields = request.fields,
		excludeItemTypes = request.excludeItemTypes,
		includeItemTypes = request.includeItemTypes,
		filters = request.filters,
		isFavorite = request.isFavorite,
		mediaTypes = request.mediaTypes,
		genres = request.genres,
		genreIds = request.genreIds,
		officialRatings = request.officialRatings,
		tags = request.tags,
		years = request.years,
		enableUserData = request.enableUserData,
		imageTypeLimit = request.imageTypeLimit,
		enableImageTypes = request.enableImageTypes,
		person = request.person,
		personIds = request.personIds,
		personTypes = request.personTypes,
		studios = request.studios,
		studioIds = request.studioIds,
		userId = request.userId,
		nameStartsWithOrGreater = request.nameStartsWithOrGreater,
		nameStartsWith = request.nameStartsWith,
		nameLessThan = request.nameLessThan,
		sortBy = request.sortBy,
		sortOrder = request.sortOrder,
		enableImages = request.enableImages,
		enableTotalRecordCount = request.enableTotalRecordCount,
	)

	/**
	 * Gets an artist by name.
	 *
	 * @param name Studio name.
	 * @param userId Optional. Filter by user id, and attach user data.
	 */
	public suspend fun getArtistByName(name: String, userId: UUID? = null): Response<BaseItemDto> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("name", name)
		}
		val queryParameters = buildMap<String, Any?>(1) {
			put("userId", userId)
		}
		val data = null
		val response = api.`get`<BaseItemDto>("/Artists/{name}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets all artists from a given item, folder, or the entire library.
	 *
	 * @param minCommunityRating Optional filter by minimum community rating.
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param searchTerm Optional. Search term.
	 * @param parentId Specify this to localize the search to a specific item or folder. Omit to use
	 * the root.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param excludeItemTypes Optional. If specified, results will be filtered out based on item type.
	 * This allows multiple, comma delimited.
	 * @param includeItemTypes Optional. If specified, results will be filtered based on item type.
	 * This allows multiple, comma delimited.
	 * @param filters Optional. Specify additional filters to apply.
	 * @param isFavorite Optional filter by items that are marked as favorite, or not.
	 * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited.
	 * @param genres Optional. If specified, results will be filtered based on genre. This allows
	 * multiple, pipe delimited.
	 * @param genreIds Optional. If specified, results will be filtered based on genre id. This allows
	 * multiple, pipe delimited.
	 * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating.
	 * This allows multiple, pipe delimited.
	 * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple,
	 * pipe delimited.
	 * @param years Optional. If specified, results will be filtered based on production year. This
	 * allows multiple, comma delimited.
	 * @param enableUserData Optional, include user data.
	 * @param imageTypeLimit Optional, the max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 * @param person Optional. If specified, results will be filtered to include only those containing
	 * the specified person.
	 * @param personIds Optional. If specified, results will be filtered to include only those
	 * containing the specified person ids.
	 * @param personTypes Optional. If specified, along with Person, results will be filtered to
	 * include only those containing the specified person and PersonType. Allows multiple,
	 * comma-delimited.
	 * @param studios Optional. If specified, results will be filtered based on studio. This allows
	 * multiple, pipe delimited.
	 * @param studioIds Optional. If specified, results will be filtered based on studio id. This
	 * allows multiple, pipe delimited.
	 * @param userId User id.
	 * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater
	 * than a given input string.
	 * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input
	 * string.
	 * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input
	 * string.
	 * @param sortBy Optional. Specify one or more sort orders, comma delimited.
	 * @param sortOrder Sort Order - Ascending,Descending.
	 * @param enableImages Optional, include image information in output.
	 * @param enableTotalRecordCount Total record count.
	 */
	public suspend fun getArtists(
		minCommunityRating: Double? = null,
		startIndex: Int? = null,
		limit: Int? = null,
		searchTerm: String? = null,
		parentId: UUID? = null,
		fields: Collection<ItemFields>? = emptyList(),
		excludeItemTypes: Collection<BaseItemKind>? = emptyList(),
		includeItemTypes: Collection<BaseItemKind>? = emptyList(),
		filters: Collection<ItemFilter>? = emptyList(),
		isFavorite: Boolean? = null,
		mediaTypes: Collection<String>? = emptyList(),
		genres: Collection<String>? = emptyList(),
		genreIds: Collection<UUID>? = emptyList(),
		officialRatings: Collection<String>? = emptyList(),
		tags: Collection<String>? = emptyList(),
		years: Collection<Int>? = emptyList(),
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: Collection<ImageType>? = emptyList(),
		person: String? = null,
		personIds: Collection<UUID>? = emptyList(),
		personTypes: Collection<String>? = emptyList(),
		studios: Collection<String>? = emptyList(),
		studioIds: Collection<UUID>? = emptyList(),
		userId: UUID? = null,
		nameStartsWithOrGreater: String? = null,
		nameStartsWith: String? = null,
		nameLessThan: String? = null,
		sortBy: Collection<String>? = emptyList(),
		sortOrder: Collection<SortOrder>? = emptyList(),
		enableImages: Boolean? = true,
		enableTotalRecordCount: Boolean? = true,
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = buildMap<String, Any?>(32) {
			put("minCommunityRating", minCommunityRating)
			put("startIndex", startIndex)
			put("limit", limit)
			put("searchTerm", searchTerm)
			put("parentId", parentId)
			put("fields", fields)
			put("excludeItemTypes", excludeItemTypes)
			put("includeItemTypes", includeItemTypes)
			put("filters", filters)
			put("isFavorite", isFavorite)
			put("mediaTypes", mediaTypes)
			put("genres", genres)
			put("genreIds", genreIds)
			put("officialRatings", officialRatings)
			put("tags", tags)
			put("years", years)
			put("enableUserData", enableUserData)
			put("imageTypeLimit", imageTypeLimit)
			put("enableImageTypes", enableImageTypes)
			put("person", person)
			put("personIds", personIds)
			put("personTypes", personTypes)
			put("studios", studios)
			put("studioIds", studioIds)
			put("userId", userId)
			put("nameStartsWithOrGreater", nameStartsWithOrGreater)
			put("nameStartsWith", nameStartsWith)
			put("nameLessThan", nameLessThan)
			put("sortBy", sortBy)
			put("sortOrder", sortOrder)
			put("enableImages", enableImages)
			put("enableTotalRecordCount", enableTotalRecordCount)
		}
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Artists", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Gets all artists from a given item, folder, or the entire library.
	 *
	 * @param request The request paramaters
	 */
	public suspend fun getArtists(request: GetArtistsRequest = GetArtistsRequest()):
			Response<BaseItemDtoQueryResult> = getArtists(
		minCommunityRating = request.minCommunityRating,
		startIndex = request.startIndex,
		limit = request.limit,
		searchTerm = request.searchTerm,
		parentId = request.parentId,
		fields = request.fields,
		excludeItemTypes = request.excludeItemTypes,
		includeItemTypes = request.includeItemTypes,
		filters = request.filters,
		isFavorite = request.isFavorite,
		mediaTypes = request.mediaTypes,
		genres = request.genres,
		genreIds = request.genreIds,
		officialRatings = request.officialRatings,
		tags = request.tags,
		years = request.years,
		enableUserData = request.enableUserData,
		imageTypeLimit = request.imageTypeLimit,
		enableImageTypes = request.enableImageTypes,
		person = request.person,
		personIds = request.personIds,
		personTypes = request.personTypes,
		studios = request.studios,
		studioIds = request.studioIds,
		userId = request.userId,
		nameStartsWithOrGreater = request.nameStartsWithOrGreater,
		nameStartsWith = request.nameStartsWith,
		nameLessThan = request.nameLessThan,
		sortBy = request.sortBy,
		sortOrder = request.sortOrder,
		enableImages = request.enableImages,
		enableTotalRecordCount = request.enableTotalRecordCount,
	)
}
