// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This exists simply to identify a set of known commands.
 */
@Serializable
public enum class GeneralCommandType {
	@SerialName("MoveUp")
	MOVE_UP,
	@SerialName("MoveDown")
	MOVE_DOWN,
	@SerialName("MoveLeft")
	MOVE_LEFT,
	@SerialName("MoveRight")
	MOVE_RIGHT,
	@SerialName("PageUp")
	PAGE_UP,
	@SerialName("PageDown")
	PAGE_DOWN,
	@SerialName("PreviousLetter")
	PREVIOUS_LETTER,
	@SerialName("NextLetter")
	NEXT_LETTER,
	@SerialName("ToggleOsd")
	TOGGLE_OSD,
	@SerialName("ToggleContextMenu")
	TOGGLE_CONTEXT_MENU,
	@SerialName("Select")
	SELECT,
	@SerialName("Back")
	BACK,
	@SerialName("TakeScreenshot")
	TAKE_SCREENSHOT,
	@SerialName("SendKey")
	SEND_KEY,
	@SerialName("SendString")
	SEND_STRING,
	@SerialName("GoHome")
	GO_HOME,
	@SerialName("GoToSettings")
	GO_TO_SETTINGS,
	@SerialName("VolumeUp")
	VOLUME_UP,
	@SerialName("VolumeDown")
	VOLUME_DOWN,
	@SerialName("Mute")
	MUTE,
	@SerialName("Unmute")
	UNMUTE,
	@SerialName("ToggleMute")
	TOGGLE_MUTE,
	@SerialName("SetVolume")
	SET_VOLUME,
	@SerialName("SetAudioStreamIndex")
	SET_AUDIO_STREAM_INDEX,
	@SerialName("SetSubtitleStreamIndex")
	SET_SUBTITLE_STREAM_INDEX,
	@SerialName("ToggleFullscreen")
	TOGGLE_FULLSCREEN,
	@SerialName("DisplayContent")
	DISPLAY_CONTENT,
	@SerialName("GoToSearch")
	GO_TO_SEARCH,
	@SerialName("DisplayMessage")
	DISPLAY_MESSAGE,
	@SerialName("SetRepeatMode")
	SET_REPEAT_MODE,
	@SerialName("ChannelUp")
	CHANNEL_UP,
	@SerialName("ChannelDown")
	CHANNEL_DOWN,
	@SerialName("Guide")
	GUIDE,
	@SerialName("ToggleStats")
	TOGGLE_STATS,
	@SerialName("PlayMediaSource")
	PLAY_MEDIA_SOURCE,
	@SerialName("PlayTrailers")
	PLAY_TRAILERS,
	@SerialName("SetShuffleQueue")
	SET_SHUFFLE_QUEUE,
	@SerialName("PlayState")
	PLAY_STATE,
	@SerialName("PlayNext")
	PLAY_NEXT,
	@SerialName("ToggleOsdMenu")
	TOGGLE_OSD_MENU,
	@SerialName("Play")
	PLAY,
}
