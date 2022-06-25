package com.example.navgraphcontroller.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.findNavController
import com.example.navgraphcontroller.R

class DescriptionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val rootView = inflater.inflate(R.layout.fragment_description, container, false)

        rootView.findViewById<ImageButton?>(R.id.backButton).setOnClickListener {
            rootView.findNavController().navigate(R.id.action_descriptionFragment_pop_including_homeFragment)
        }

        return rootView.rootView
    }

}