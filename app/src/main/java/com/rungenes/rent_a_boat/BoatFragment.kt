package com.rungenes.rent_a_boat


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rungenes.rent_a_boat.feed.BOATS
import com.rungenes.rent_a_boat.feed.getBoat
import kotlinx.android.synthetic.main.item_boat.view.*

/**
 * A simple [Fragment] subclass.
 */
class BoatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val id = BoatFragmentArgs.fromBundle(arguments!!).id


        val boat = BOATS.getBoat(id)
        // Inflate the layout for this fragment
        val view=  inflater.inflate(R.layout.fragment_boat, container, false)
        view.nameTextView.text = boat.name
        view.locationTextView.text=boat.location
        view.imageView2.setImageResource(boat.picture)
        view.priceTextView.text = boat.price

        return view
    }


}
