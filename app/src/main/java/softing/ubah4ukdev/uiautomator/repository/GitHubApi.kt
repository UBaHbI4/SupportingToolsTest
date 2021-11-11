package softing.ubah4ukdev.uiautomator.repository

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
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
internal interface GitHubApi {

    @Headers("Accept: application/vnd.github.mercy-preview+json")
    @GET("search/repositories")
    fun searchGithub(@Query("q") term: String?): Call<SearchResponse?>?
}