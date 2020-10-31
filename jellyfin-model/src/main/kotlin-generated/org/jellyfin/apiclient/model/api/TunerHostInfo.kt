// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class TunerHostInfo(
	@SerialName("Id")
	public val id: String? = null,
	@SerialName("Url")
	public val url: String? = null,
	@SerialName("Type")
	public val type: String? = null,
	@SerialName("DeviceId")
	public val deviceId: String? = null,
	@SerialName("FriendlyName")
	public val friendlyName: String? = null,
	@SerialName("ImportFavoritesOnly")
	public val importFavoritesOnly: Boolean,
	@SerialName("AllowHWTranscoding")
	public val allowHwTranscoding: Boolean,
	@SerialName("EnableStreamLooping")
	public val enableStreamLooping: Boolean,
	@SerialName("Source")
	public val source: String? = null,
	@SerialName("TunerCount")
	public val tunerCount: Int,
	@SerialName("UserAgent")
	public val userAgent: String? = null
)
