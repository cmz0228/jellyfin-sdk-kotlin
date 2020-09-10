// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.io.InputStream
import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.RemoteSubtitleInfo

class SubtitleApi(
	private val api: KtorClient
) {
	/**
	 * Search remote subtitles.
	 *
	 * @param itemId The item id.
	 * @param language The language of the subtitles.
	 * @param isPerfectMatch Optional. Only show subtitles which are a perfect match.
	 */
	suspend fun searchRemoteSubtitles(
		itemId: UUID,
		language: String,
		isPerfectMatch: Boolean? = null
	): Response<List<RemoteSubtitleInfo>> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		pathParameters["language"] = language
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["isPerfectMatch"] = isPerfectMatch
		val data = null
		val response =
				api.get<List<RemoteSubtitleInfo>>("/Items/{itemId}/RemoteSearch/Subtitles/{language}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Downloads a remote subtitle.
	 *
	 * @param itemId The item id.
	 * @param subtitleId The subtitle id.
	 */
	suspend fun downloadRemoteSubtitles(itemId: UUID, subtitleId: String): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		pathParameters["subtitleId"] = subtitleId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<Unit>("/Items/{itemId}/RemoteSearch/Subtitles/{subtitleId}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets the remote subtitles.
	 *
	 * @param id The item id.
	 */
	suspend fun getRemoteSubtitles(id: String): Response<String> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["id"] = id
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<String>("/Providers/Subtitles/Subtitles/{id}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param itemId The item id.
	 * @param mediaSourceId The media source id.
	 * @param index The subtitle stream index.
	 * @param format The format of the returned subtitle.
	 * @param startPositionTicks Optional. The start position of the subtitle in ticks.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 */
	suspend fun getSubtitle_2(
		itemId: UUID,
		mediaSourceId: String,
		index: Int,
		format: String,
		startPositionTicks: Long,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean,
		addVttTimeMap: Boolean
	): Response<String> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		pathParameters["mediaSourceId"] = mediaSourceId
		pathParameters["index"] = index
		pathParameters["format"] = format
		pathParameters["startPositionTicks"] = startPositionTicks
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["endPositionTicks"] = endPositionTicks
		queryParameters["copyTimestamps"] = copyTimestamps
		queryParameters["addVttTimeMap"] = addVttTimeMap
		val data = null
		val response =
				api.get<String>("/Videos/{itemId}/{mediaSourceId}/Subtitles/{index}/{startPositionTicks}/Stream.{format}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param itemId The item id.
	 * @param mediaSourceId The media source id.
	 * @param index The subtitle stream index.
	 * @param format The format of the returned subtitle.
	 * @param startPositionTicks Optional. The start position of the subtitle in ticks.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 */
	suspend fun getSubtitle(
		itemId: UUID,
		mediaSourceId: String,
		index: Int,
		format: String,
		startPositionTicks: Long,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean,
		addVttTimeMap: Boolean
	): Response<String> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		pathParameters["mediaSourceId"] = mediaSourceId
		pathParameters["index"] = index
		pathParameters["format"] = format
		pathParameters["startPositionTicks"] = startPositionTicks
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["endPositionTicks"] = endPositionTicks
		queryParameters["copyTimestamps"] = copyTimestamps
		queryParameters["addVttTimeMap"] = addVttTimeMap
		val data = null
		val response =
				api.get<String>("/Videos/{itemId}/{mediaSourceId}/Subtitles/{index}/Stream.{format}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets an HLS subtitle playlist.
	 *
	 * @param itemId The item id.
	 * @param index The subtitle stream index.
	 * @param mediaSourceId The media source id.
	 * @param segmentLength The subtitle segment length.
	 */
	suspend fun getSubtitlePlaylist(
		itemId: UUID,
		index: Int,
		mediaSourceId: String,
		segmentLength: Int
	): Response<InputStream> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		pathParameters["index"] = index
		pathParameters["mediaSourceId"] = mediaSourceId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["segmentLength"] = segmentLength
		val data = null
		val response =
				api.get<InputStream>("/Videos/{itemId}/{mediaSourceId}/Subtitles/{index}/subtitles.m3u8",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Deletes an external subtitle file.
	 *
	 * @param itemId The item id.
	 * @param index The index of the subtitle file.
	 */
	suspend fun deleteSubtitle(itemId: UUID, index: Int): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		pathParameters["index"] = index
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.delete<Unit>("/Videos/{itemId}/Subtitles/{index}", pathParameters,
				queryParameters, data)
		return response
	}
}
