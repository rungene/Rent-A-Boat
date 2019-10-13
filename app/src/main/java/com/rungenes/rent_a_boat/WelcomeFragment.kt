package com.rungenes.rent_a_boat


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        view.findViewById<Button>(R.id.button_registration).setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_registrationFragment)
        )



        return view

    }
}
