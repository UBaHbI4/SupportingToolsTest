package softing.ubah4ukdev.uiautomator.presenter.search

import retrofit2.Response
import softing.ubah4ukdev.uiautomator.model.SearchResponse
import softing.ubah4ukdev.uiautomator.presenter.RepositoryContract
import softing.ubah4ukdev.uiautomator.repository.RepositoryCallback
import softing.ubah4ukdev.uiautomator.view.search.ViewSearchContract

/**
 *   Project: UIAutomator
 *
 *   Package: softing.ubah4ukdev.uiautomator.presenter.search
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
internal class SearchPresenter internal constructor(
    private val viewContract: ViewSearchContract,
    private val repository: RepositoryContract
) : PresenterSearchContract, RepositoryCallback {

    override fun searchGitHub(searchQuery: String) {
        viewContract.displayLoading(true)
        repository.searchGithub(searchQuery, this)
    }

    override fun handleGitHubResponse(response: Response<SearchResponse?>?) {
        viewContract.displayLoading(false)
        if (response != null && response.isSuccessful) {
            val searchResponse = response.body()
            val searchResults = searchResponse?.searchResults
            val totalCount = searchResponse?.totalCount
            if (searchResults != null && totalCount != null) {
                viewContract.displaySearchResults(
                    searchResults,
                    totalCount
                )
            } else {
                viewContract.displayError("Search results or total count are null")
            }
        } else {
            viewContract.displayError("Response is null or unsuccessful")
        }
    }

    override fun handleGitHubError() {
        viewContract.displayLoading(false)
        viewContract.displayError()
    }
}