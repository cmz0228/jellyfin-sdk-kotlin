// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptyMap
import kotlin.collections.mutableMapOf
import org.jellyfin.sdk.api.client.ApiClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.api.client.extensions.`get`
import org.jellyfin.sdk.api.client.extensions.delete
import org.jellyfin.sdk.api.client.extensions.post
import org.jellyfin.sdk.model.api.TaskInfo
import org.jellyfin.sdk.model.api.TaskTriggerInfo

public class ScheduledTasksApi(
	private val api: ApiClient
) : Api {
	/**
	 * Get task by id.
	 *
	 * @param taskId Task Id.
	 */
	public suspend fun getTask(taskId: String): Response<TaskInfo> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["taskId"] = taskId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<TaskInfo>("/ScheduledTasks/{taskId}", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Get tasks.
	 *
	 * @param isHidden Optional filter tasks that are hidden, or not.
	 * @param isEnabled Optional filter tasks that are enabled, or not.
	 */
	public suspend fun getTasks(isHidden: Boolean? = null, isEnabled: Boolean? = null):
			Response<List<TaskInfo>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["isHidden"] = isHidden
		queryParameters["isEnabled"] = isEnabled
		val data = null
		val response = api.`get`<List<TaskInfo>>("/ScheduledTasks", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Start specified task.
	 *
	 * @param taskId Task Id.
	 */
	public suspend fun startTask(taskId: String): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["taskId"] = taskId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<Unit>("/ScheduledTasks/Running/{taskId}", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Stop specified task.
	 *
	 * @param taskId Task Id.
	 */
	public suspend fun stopTask(taskId: String): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["taskId"] = taskId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.delete<Unit>("/ScheduledTasks/Running/{taskId}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Update specified task triggers.
	 *
	 * @param taskId Task Id.
	 */
	public suspend fun updateTask(taskId: String, `data`: List<TaskTriggerInfo>): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["taskId"] = taskId
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/ScheduledTasks/{taskId}/Triggers", pathParameters,
				queryParameters, data)
		return response
	}
}
