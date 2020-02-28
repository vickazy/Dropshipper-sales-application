package com.tutorkomputer.penjualan.ui.user

import com.tutorkomputer.penjualan.data.database.PrefsManager

class UserPresenter (val view: UserContract.View) : UserContract.Presenter {

    init {
        view.initActivity()
        view.initListener()
    }

    override fun doLogin(prefsManager: PrefsManager) {
        if (prefsManager.prefsisLogin) view.onResultLogin(prefsManager);
    }

    override fun doLogout(prefsManager: PrefsManager) {
        prefsManager.Logout()
        view.showMessage("Berhasil Keluar")
        view.onResultLogout()
    }


}