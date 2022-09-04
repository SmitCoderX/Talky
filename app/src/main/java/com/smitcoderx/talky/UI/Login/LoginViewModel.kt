package com.smitcoderx.talky.UI.Login

import androidx.lifecycle.ViewModel
import com.smitcoderx.talky.domain.LoginRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
) : ViewModel() {

    @Inject
    lateinit var repository: LoginRepository

    fun login(phoneNumber: String) {
        repository.login(phoneNumber)
    }

    fun signup(phoneNumber: String) {
        repository.signup(phoneNumber)
    }
}