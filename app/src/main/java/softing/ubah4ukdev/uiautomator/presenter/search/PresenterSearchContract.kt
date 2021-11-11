package softing.ubah4ukdev.uiautomator.presenter.search

import softing.ubah4ukdev.uiautomator.presenter.PresenterContract

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
internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
}