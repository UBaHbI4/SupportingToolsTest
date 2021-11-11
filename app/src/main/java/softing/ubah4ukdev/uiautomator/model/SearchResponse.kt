package softing.ubah4ukdev.uiautomator.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 *   Project: UIAutomator
 *
 *   Package: softing.ubah4ukdev.uiautomator.model
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
data class SearchResponse(
    @SerializedName("total_count")
    @Expose
    val totalCount: Int?,
    @SerializedName("items")
    @Expose
    val searchResults: List<SearchResult>?
)