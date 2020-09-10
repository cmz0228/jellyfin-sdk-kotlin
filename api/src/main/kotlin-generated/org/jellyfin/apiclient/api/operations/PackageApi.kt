// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.PackageInfo
import org.jellyfin.apiclient.model.RepositoryInfo

class PackageApi(
	private val api: KtorClient
) {
	/**
	 * Gets available packages.
	 */
	suspend fun getPackages(): Response<List<PackageInfo>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<List<PackageInfo>>("/Packages", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets a package by name or assembly GUID.
	 *
	 * @param name The name of the package.
	 * @param assemblyGuid The GUID of the associated assembly.
	 */
	suspend fun getPackageInfo(name: String, assemblyGuid: String? = null): Response<PackageInfo> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["name"] = name
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["assemblyGuid"] = assemblyGuid
		val data = null
		val response = api.get<PackageInfo>("/Packages/{name}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Installs a package.
	 *
	 * @param name Package name.
	 * @param assemblyGuid GUID of the associated assembly.
	 * @param version Optional version. Defaults to latest version.
	 */
	suspend fun installPackage(
		name: String,
		assemblyGuid: String? = null,
		version: String? = null
	): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["name"] = name
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["assemblyGuid"] = assemblyGuid
		queryParameters["version"] = version
		val data = null
		val response = api.post<Unit>("/Packages/Installed/{name}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Cancels a package installation.
	 *
	 * @param packageId Installation Id.
	 */
	suspend fun cancelPackageInstallation(packageId: UUID): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["packageId"] = packageId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.delete<Unit>("/Packages/Installing/{packageId}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets all package repositories.
	 */
	suspend fun getRepositories(): Response<List<RepositoryInfo>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<List<RepositoryInfo>>("/Repositories", pathParameters, queryParameters,
				data)
		return response
	}
}
