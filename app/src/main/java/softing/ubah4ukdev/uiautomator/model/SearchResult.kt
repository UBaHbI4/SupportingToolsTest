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
data class SearchResult(
    @SerializedName("id")
    @Expose
    val id: Int?,
    @SerializedName("name")
    @Expose
    val name: String?,
    @SerializedName("full_name")
    @Expose
    val fullName: String?,
    @SerializedName("private")
    @Expose
    private val private: Boolean?,
    @SerializedName("description")
    @Expose
    val description: String?,
    @SerializedName("updated_at")
    @Expose
    val updatedAt: String?,
    @SerializedName("size")
    @Expose
    val size: Int?,
    @SerializedName("stargazers_count")
    @Expose
    val stargazersCount: Int?,
    @SerializedName("language")
    @Expose
    val language: String?,
    @SerializedName("has_wiki")
    @Expose
    val hasWiki: Boolean?,
    @SerializedName("archived")
    @Expose
    val archived: Boolean?,
    @SerializedName("score")
    @Expose
    val score: Double?
)