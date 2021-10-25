package com.ranganayaki.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.ranganayaki.details.databinding.FragmentDataEntryBinding

class DataEntryFragment : Fragment() {
    private lateinit var binding : FragmentDataEntryBinding
    //private val args : SpecifyAmountFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentDataEntryBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navCon = findNavController()

        //binding.textView5.text = "Sending Money to ${args.nm}"
        binding.btnSave.setOnClickListener {
            val n = binding.editNAme.text.toString()
            val amount = binding.editPrice.text.toString().toInt()
            val dt = binding.editDate.text.toString()

            val action = DataEntryFragmentDirections.actionDataEntryFragmentToMainFragment(name = n, price = amount,date = dt)

            navCon.navigate(action)

        }

    }

}