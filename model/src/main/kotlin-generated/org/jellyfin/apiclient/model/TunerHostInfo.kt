// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import kotlin.Boolean
import kotlin.Int
import kotlin.String

data class TunerHostInfo(
	val id: String? = null,
	val url: String? = null,
	val type: String? = null,
	val deviceId: String? = null,
	val friendlyName: String? = null,
	val importFavoritesOnly: Boolean,
	val allowHwTranscoding: Boolean,
	val enableStreamLooping: Boolean,
	val source: String? = null,
	val tunerCount: Int,
	val userAgent: String? = null
)
