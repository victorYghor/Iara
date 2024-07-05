package com.iara.login;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    MutableLiveData<Boolean> isLoggedIn = new MutableLiveData<Boolean>(false);

}
