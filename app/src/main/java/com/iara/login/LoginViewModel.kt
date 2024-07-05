package com.iara.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    @JvmField
    var isLoggedIn = MutableLiveData<Boolean>(false)

}
