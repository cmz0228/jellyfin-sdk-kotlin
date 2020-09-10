// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import kotlin.collections.List

/**
 * Library options result dto.
 */
data class LibraryOptionsResultDto(
	/**
	 * Gets or sets the metadata savers.
	 */
	val metadataSavers: List<LibraryOptionInfoDto>? = null,
	/**
	 * Gets or sets the metadata readers.
	 */
	val metadataReaders: List<LibraryOptionInfoDto>? = null,
	/**
	 * Gets or sets the subtitle fetchers.
	 */
	val subtitleFetchers: List<LibraryOptionInfoDto>? = null,
	/**
	 * Gets or sets the type options.
	 */
	val typeOptions: List<LibraryTypeOptionsDto>? = null
)
