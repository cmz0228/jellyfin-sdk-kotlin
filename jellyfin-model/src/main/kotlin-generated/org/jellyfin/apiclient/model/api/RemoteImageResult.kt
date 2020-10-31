// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Class RemoteImageResult.
 */
@Serializable
public data class RemoteImageResult(
	/**
	 * Gets or sets the images.
	 */
	@SerialName("Images")
	public val images: List<RemoteImageInfo>? = null,
	/**
	 * Gets or sets the total record count.
	 */
	@SerialName("TotalRecordCount")
	public val totalRecordCount: Int,
	/**
	 * Gets or sets the providers.
	 */
	@SerialName("Providers")
	public val providers: List<String>? = null
)
