// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import kotlin.Int
import kotlin.collections.List

data class DeviceInfoQueryResult(
	/**
	 * Gets or sets the items.
	 */
	val items: List<DeviceInfo>? = null,
	/**
	 * The total number of records available.
	 */
	val totalRecordCount: Int,
	/**
	 * The index of the first record in Items.
	 */
	val startIndex: Int
)
