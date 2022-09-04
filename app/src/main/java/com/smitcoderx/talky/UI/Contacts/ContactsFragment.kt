package com.smitcoderx.talky.UI.Contacts

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.smitcoderx.talky.R
import com.smitcoderx.talky.databinding.FragmentContactsBinding

class ContactsFragment : Fragment(R.layout.fragment_contacts) {

    private lateinit var binding: FragmentContactsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentContactsBinding.bind(view)


    }

}