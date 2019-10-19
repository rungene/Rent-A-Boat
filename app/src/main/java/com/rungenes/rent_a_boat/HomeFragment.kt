package com.rungenes.rent_a_boat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class homeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val navHostFragment =childFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment

        view.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
            .setupWithNavController(navController = navHostFragment.navController )


        val toolbar = view.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        navHostFragment.navController.addOnDestinationChangedListener { _, destination, _ ->
            toolbar.title=destination.label
        }



        return view
    }


}
