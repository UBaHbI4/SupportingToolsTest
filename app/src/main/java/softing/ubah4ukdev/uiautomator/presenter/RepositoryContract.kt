package softing.ubah4ukdev.uiautomator.presenter

import softing.ubah4ukdev.uiautomator.repository.RepositoryCallback

/**
 *   Project: UIAutomator
 *
 *   Package: softing.ubah4ukdev.uiautomator.presenter
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
internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}