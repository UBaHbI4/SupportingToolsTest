package softing.ubah4ukdev.uiautomator.presenter.details

import softing.ubah4ukdev.uiautomator.presenter.PresenterContract

/**
 *   Project: UIAutomator
 *
 *   Package: softing.ubah4ukdev.uiautomator.presenter.details
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
internal interface PresenterDetailsContract : PresenterContract {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}