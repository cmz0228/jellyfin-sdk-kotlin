// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.BaseItemDto
import org.jellyfin.apiclient.model.api.BaseItemDtoQueryResult
import org.jellyfin.apiclient.model.api.ItemFilter

public class PersonsApi(
	private val api: KtorClient
) {
	/**
	 * Gets all persons from a given item, folder, or the entire library.
	 *
	 * @param minCommunityRating Optional filter by minimum community rating.
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param searchTerm The search term.
	 * @param parentId Specify this to localize the search to a specific item or folder. Omit to use
	 * the root.
	 * @param fields Optional. Specify additional fields of information to return in the output. This
	 * allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl,
	 * IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio,
	 * Revenue, SortName, Studios, Taglines.
	 * @param excludeItemTypes Optional. If specified, results will be filtered out based on item type.
	 * This allows multiple, comma delimited.
	 * @param includeItemTypes Optional. If specified, results will be filtered in based on item type.
	 * This allows multiple, comma delimited.
	 * @param filters Optional. Specify additional filters to apply. This allows multiple, comma
	 * delimited. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes,
	 * Dislikes.
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
	 * containing the specified person id.
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
	 * @param enableImages Optional, include image information in output.
	 * @param enableTotalRecordCount Optional. Include total record count.
	 */
	public suspend fun getPersons(
		minCommunityRating: Double? = null,
		startIndex: Int? = null,
		limit: Int? = null,
		searchTerm: String? = null,
		parentId: String? = null,
		fields: String? = null,
		excludeItemTypes: String? = null,
		includeItemTypes: String? = null,
		filters: List<ItemFilter>? = emptyList(),
		isFavorite: Boolean? = null,
		mediaTypes: String? = null,
		genres: String? = null,
		genreIds: String? = null,
		officialRatings: String? = null,
		tags: String? = null,
		years: String? = null,
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: String? = null,
		person: String? = null,
		personIds: String? = null,
		personTypes: String? = null,
		studios: String? = null,
		studioIds: String? = null,
		userId: UUID? = null,
		nameStartsWithOrGreater: String? = null,
		nameStartsWith: String? = null,
		nameLessThan: String? = null,
		enableImages: Boolean? = true,
		enableTotalRecordCount: Boolean = true
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["minCommunityRating"] = minCommunityRating
		queryParameters["startIndex"] = startIndex
		queryParameters["limit"] = limit
		queryParameters["searchTerm"] = searchTerm
		queryParameters["parentId"] = parentId
		queryParameters["fields"] = fields
		queryParameters["excludeItemTypes"] = excludeItemTypes
		queryParameters["includeItemTypes"] = includeItemTypes
		queryParameters["filters"] = filters
		queryParameters["isFavorite"] = isFavorite
		queryParameters["mediaTypes"] = mediaTypes
		queryParameters["genres"] = genres
		queryParameters["genreIds"] = genreIds
		queryParameters["officialRatings"] = officialRatings
		queryParameters["tags"] = tags
		queryParameters["years"] = years
		queryParameters["enableUserData"] = enableUserData
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		queryParameters["person"] = person
		queryParameters["personIds"] = personIds
		queryParameters["personTypes"] = personTypes
		queryParameters["studios"] = studios
		queryParameters["studioIds"] = studioIds
		queryParameters["userId"] = userId
		queryParameters["nameStartsWithOrGreater"] = nameStartsWithOrGreater
		queryParameters["nameStartsWith"] = nameStartsWith
		queryParameters["nameLessThan"] = nameLessThan
		queryParameters["enableImages"] = enableImages
		queryParameters["enableTotalRecordCount"] = enableTotalRecordCount
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Persons", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Get person by name.
	 *
	 * @param name Person name.
	 * @param userId Optional. Filter by user id, and attach user data.
	 */
	public suspend fun getPerson(name: String, userId: UUID? = null): Response<BaseItemDto> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["name"] = name
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		val data = null
		val response = api.`get`<BaseItemDto>("/Persons/{name}", pathParameters, queryParameters, data)
		return response
	}
}
