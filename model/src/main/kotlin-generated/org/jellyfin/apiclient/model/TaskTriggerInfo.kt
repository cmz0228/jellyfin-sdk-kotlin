// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import kotlin.Long
import kotlin.String

/**
 * Class TaskTriggerInfo.
 */
data class TaskTriggerInfo(
	/**
	 * Gets or sets the type.
	 */
	val type: String? = null,
	/**
	 * Gets or sets the time of day.
	 */
	val timeOfDayTicks: Long? = null,
	/**
	 * Gets or sets the interval.
	 */
	val intervalTicks: Long? = null,
	val dayOfWeek: DayOfWeek,
	/**
	 * Gets or sets the maximum runtime ticks.
	 */
	val maxRuntimeTicks: Long? = null
)
