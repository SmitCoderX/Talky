package com.smitcoderx.talky.UI.Register

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.smitcoderx.talky.R
import com.smitcoderx.talky.databinding.FragmentRegisterBinding

class RegisterFragment: Fragment(R.layout.fragment_register) {

    private lateinit var binding: FragmentRegisterBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRegisterBinding.bind(view)

        

    }

}