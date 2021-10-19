package com.ranganayaki.myapplication.recgrd

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ranganayaki.myapplication.R
import com.ranganayaki.myapplication.databinding.FragmentRecBasicDetailsBinding


class RecSalaryDetailsFragment : Fragment() {

    val viewModel : SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        activity?.title="Salary Details"

        val binding = DataBindingUtil.inflate<FragmentRecBasicDetailsBinding>(
            inflater,
            R.layout.fragmnet_rec_salary_details,
            container,
            false
        )
        binding.lifecycleOwner = this
        binding.vm = viewModel

        return binding.root
    }
}