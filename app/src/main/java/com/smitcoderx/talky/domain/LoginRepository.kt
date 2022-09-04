package com.smitcoderx.talky.domain

import android.util.Log
import com.smitcoderx.talky.Utils.Constants.TAG

interface LoginRepository {

    fun signup(phoneNumber: String) {
        Log.d(TAG, "signup: $phoneNumber")
    }

    fun login(phoneNumber: String) {
        Log.d(TAG, "login: $phoneNumber")
    }

}