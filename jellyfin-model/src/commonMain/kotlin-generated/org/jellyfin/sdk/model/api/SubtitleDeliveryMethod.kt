// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Delivery method to use during playback of a specific subtitle format.
 */
@Serializable
public enum class SubtitleDeliveryMethod(
	public val serialName: String,
) {
	@SerialName("Encode")
	ENCODE("Encode"),
	@SerialName("Embed")
	EMBED("Embed"),
	@SerialName("External")
	EXTERNAL("External"),
	@SerialName("Hls")
	HLS("Hls"),
	@SerialName("Drop")
	DROP("Drop"),
	;

	public override fun toString(): String = serialName
}
