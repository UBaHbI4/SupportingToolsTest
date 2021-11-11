package softing.ubah4ukdev.uiautomator.repository

import retrofit2.Response
import softing.ubah4ukdev.uiautomator.model.SearchResponse
import softing.ubah4ukdev.uiautomator.presenter.RepositoryContract

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
internal class FakeGitHubRepository : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }
}