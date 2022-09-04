package com.smitcoderx.talky.UI.Stories

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.smitcoderx.talky.R
import com.smitcoderx.talky.databinding.FragmentStoriesBinding

class StoriesFragment : Fragment(R.layout.fragment_stories) {

    private lateinit var binding: FragmentStoriesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentStoriesBinding.bind(view)


    }

}