// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import java.util.UUID
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List

/**
 * Class PlaybackStartInfo.
 */
data class PlaybackStartInfo(
	/**
	 * Gets or sets a value indicating whether this instance can seek.
	 */
	val canSeek: Boolean,
	val item: BaseItemDto,
	/**
	 * Gets or sets the item identifier.
	 */
	val itemId: UUID,
	/**
	 * Gets or sets the session id.
	 */
	val sessionId: String? = null,
	/**
	 * Gets or sets the media version identifier.
	 */
	val mediaSourceId: String? = null,
	/**
	 * Gets or sets the index of the audio stream.
	 */
	val audioStreamIndex: Int? = null,
	/**
	 * Gets or sets the index of the subtitle stream.
	 */
	val subtitleStreamIndex: Int? = null,
	/**
	 * Gets or sets a value indicating whether this instance is paused.
	 */
	val isPaused: Boolean,
	/**
	 * Gets or sets a value indicating whether this instance is muted.
	 */
	val isMuted: Boolean,
	/**
	 * Gets or sets the position ticks.
	 */
	val positionTicks: Long? = null,
	val playbackStartTimeTicks: Long? = null,
	/**
	 * Gets or sets the volume level.
	 */
	val volumeLevel: Int? = null,
	val brightness: Int? = null,
	val aspectRatio: String? = null,
	val playMethod: PlayMethod,
	/**
	 * Gets or sets the live stream identifier.
	 */
	val liveStreamId: String? = null,
	/**
	 * Gets or sets the play session identifier.
	 */
	val playSessionId: String? = null,
	val repeatMode: RepeatMode,
	val nowPlayingQueue: List<QueueItem>? = null,
	val playlistItemId: String? = null
)
