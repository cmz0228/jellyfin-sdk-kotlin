// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Double
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Used to hold information about a user's list of configured virtual folders.
 */
@Serializable
public data class VirtualFolderInfo(
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	public val name: String? = null,
	/**
	 * Gets or sets the locations.
	 */
	@SerialName("Locations")
	public val locations: List<String>? = null,
	/**
	 * Gets or sets the type of the collection.
	 */
	@SerialName("CollectionType")
	public val collectionType: String? = null,
	@SerialName("LibraryOptions")
	public val libraryOptions: LibraryOptions? = null,
	/**
	 * Gets or sets the item identifier.
	 */
	@SerialName("ItemId")
	public val itemId: String? = null,
	/**
	 * Gets or sets the primary image item identifier.
	 */
	@SerialName("PrimaryImageItemId")
	public val primaryImageItemId: String? = null,
	@SerialName("RefreshProgress")
	public val refreshProgress: Double? = null,
	@SerialName("RefreshStatus")
	public val refreshStatus: String? = null
)
