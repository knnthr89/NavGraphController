package com.example.navgraphcontroller.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.example.navgraphcontroller.R

class HomeFragment : Fragment() {

    private lateinit var nextScreenButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       var rootView = inflater.inflate(R.layout.fragment_home, container, false)

        nextScreenButton = rootView.findViewById(R.id.nextScreenButton)

        nextScreenButton.setOnClickListener {
            rootView.findNavController().navigate(R.id.action_homeFragment_to_descriptionFragment)
        }

        return rootView.rootView
    }
}