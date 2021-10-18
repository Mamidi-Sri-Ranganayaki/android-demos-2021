package com.ranganayaki.myapplication.recgrd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ranganayaki.myapplication.R


class RecGrdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rec_grd, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recDsh = view.findViewById<RecyclerView>(R.id.recDsh)
        recDsh.layoutManager = GridLayoutManager(
            requireContext(),
            2
        )

        recDsh.adapter = RecDshAdapter(
            requireContext(),
            listOf(
                RecDsh("Home", R.drawable.ic_ph),
                RecDsh("Admin", R.drawable.ic_ad),
                RecDsh("Settings", R.drawable.ic_st),
                RecDsh("Profile", R.drawable.ic_pff)
            )
        )
    }
}
