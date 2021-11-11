package softing.ubah4ukdev.uiautomator.repository

import retrofit2.Response
import softing.ubah4ukdev.uiautomator.model.SearchResponse

/**
 *   Project: UIAutomator
 *
 *   Package: softing.ubah4ukdev.uiautomator.repository
 *
 *   Created by Ivan Sheynmaer
 *
 *   Description:
 *
 *
 *   2021.11.07
 *
 *   v1.0
 */
interface RepositoryCallback {
    fun handleGitHubResponse(response: Response<SearchResponse?>?)
    fun handleGitHubError()
}