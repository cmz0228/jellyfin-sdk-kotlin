// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public enum class TranscodeReason {
	@SerialName("ContainerNotSupported")
	CONTAINER_NOT_SUPPORTED,
	@SerialName("VideoCodecNotSupported")
	VIDEO_CODEC_NOT_SUPPORTED,
	@SerialName("AudioCodecNotSupported")
	AUDIO_CODEC_NOT_SUPPORTED,
	@SerialName("ContainerBitrateExceedsLimit")
	CONTAINER_BITRATE_EXCEEDS_LIMIT,
	@SerialName("AudioBitrateNotSupported")
	AUDIO_BITRATE_NOT_SUPPORTED,
	@SerialName("AudioChannelsNotSupported")
	AUDIO_CHANNELS_NOT_SUPPORTED,
	@SerialName("VideoResolutionNotSupported")
	VIDEO_RESOLUTION_NOT_SUPPORTED,
	@SerialName("UnknownVideoStreamInfo")
	UNKNOWN_VIDEO_STREAM_INFO,
	@SerialName("UnknownAudioStreamInfo")
	UNKNOWN_AUDIO_STREAM_INFO,
	@SerialName("AudioProfileNotSupported")
	AUDIO_PROFILE_NOT_SUPPORTED,
	@SerialName("AudioSampleRateNotSupported")
	AUDIO_SAMPLE_RATE_NOT_SUPPORTED,
	@SerialName("AnamorphicVideoNotSupported")
	ANAMORPHIC_VIDEO_NOT_SUPPORTED,
	@SerialName("InterlacedVideoNotSupported")
	INTERLACED_VIDEO_NOT_SUPPORTED,
	@SerialName("SecondaryAudioNotSupported")
	SECONDARY_AUDIO_NOT_SUPPORTED,
	@SerialName("RefFramesNotSupported")
	REF_FRAMES_NOT_SUPPORTED,
	@SerialName("VideoBitDepthNotSupported")
	VIDEO_BIT_DEPTH_NOT_SUPPORTED,
	@SerialName("VideoBitrateNotSupported")
	VIDEO_BITRATE_NOT_SUPPORTED,
	@SerialName("VideoFramerateNotSupported")
	VIDEO_FRAMERATE_NOT_SUPPORTED,
	@SerialName("VideoLevelNotSupported")
	VIDEO_LEVEL_NOT_SUPPORTED,
	@SerialName("VideoProfileNotSupported")
	VIDEO_PROFILE_NOT_SUPPORTED,
	@SerialName("AudioBitDepthNotSupported")
	AUDIO_BIT_DEPTH_NOT_SUPPORTED,
	@SerialName("SubtitleCodecNotSupported")
	SUBTITLE_CODEC_NOT_SUPPORTED,
	@SerialName("DirectPlayError")
	DIRECT_PLAY_ERROR,
}
