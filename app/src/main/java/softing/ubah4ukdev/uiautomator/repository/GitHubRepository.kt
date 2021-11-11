package softing.ubah4ukdev.uiautomator.repository

import retrofit2.Call
import retrofit2.Callback
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
internal class GitHubRepository(private val gitHubApi: GitHubApi) : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        val call = gitHubApi.searchGithub(query)
        call?.enqueue(object : Callback<SearchResponse?> {

            override fun onResponse(
                call: Call<SearchResponse?>,
                response: Response<SearchResponse?>
            ) {
                callback.handleGitHubResponse(response)
            }

            override fun onFailure(
                call: Call<SearchResponse?>,
                t: Throwable
            ) {
                callback.handleGitHubError()
            }
        })
    }
}