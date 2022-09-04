package com.smitcoderx.talky.UI.OnBoarding

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.smitcoderx.talky.R
import com.smitcoderx.talky.Utils.Constants.TAG
import com.smitcoderx.talky.databinding.FragmentOnBoardingBinding

class OnBoardingFragment : Fragment(R.layout.fragment_on_boarding) {

    private lateinit var binding: FragmentOnBoardingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOnBoardingBinding.bind(view)

        binding.lottieOnboard.setFailureListener {
            Log.d(TAG, "LottieFailure: ${it.message}")
        }
        binding.btnLetsGo.setOnClickListener {
            findNavController().navigate(OnBoardingFragmentDirections.actionOnBoardingFragmentToLoginFragment())
        }


    }

}