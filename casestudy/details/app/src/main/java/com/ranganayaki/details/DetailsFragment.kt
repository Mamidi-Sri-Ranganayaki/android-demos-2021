package com.ranganayaki.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.ranganayaki.details.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {
    private lateinit var binding : FragmentDetailsBinding
    private val args : DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentDetailsBinding.inflate(
            inflater,
            container,
            false
        )

        binding.dn.text = args.nm
        binding.dt.text = args.dt
        binding.dp.text = args.pric

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

}