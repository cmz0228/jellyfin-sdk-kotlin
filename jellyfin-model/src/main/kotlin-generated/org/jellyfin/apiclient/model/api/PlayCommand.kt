// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Enum PlayCommand.
 */
@Serializable
public enum class PlayCommand {
	@SerialName("PlayNow")
	PLAY_NOW,
	@SerialName("PlayNext")
	PLAY_NEXT,
	@SerialName("PlayLast")
	PLAY_LAST,
	@SerialName("PlayInstantMix")
	PLAY_INSTANT_MIX,
	@SerialName("PlayShuffle")
	PLAY_SHUFFLE,
}
