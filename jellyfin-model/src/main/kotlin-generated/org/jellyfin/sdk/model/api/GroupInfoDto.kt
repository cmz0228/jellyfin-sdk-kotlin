// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(
	UUIDSerializer::class,
	DateTimeSerializer::class
)

package org.jellyfin.sdk.model.api

import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.DateTime
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.DateTimeSerializer
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Class GroupInfoDto.
 */
@Serializable
public data class GroupInfoDto(
	/**
	 * Gets the group identifier.
	 */
	@SerialName("GroupId")
	public val groupId: UUID,
	/**
	 * Gets the group name.
	 */
	@SerialName("GroupName")
	public val groupName: String? = null,
	/**
	 * Gets the group state.
	 */
	@SerialName("State")
	public val state: GroupStateType,
	/**
	 * Gets the participants.
	 */
	@SerialName("Participants")
	public val participants: List<String>? = null,
	/**
	 * Gets the date when this DTO has been created.
	 */
	@SerialName("LastUpdatedAt")
	public val lastUpdatedAt: DateTime
)
