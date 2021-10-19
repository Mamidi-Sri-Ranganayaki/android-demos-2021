package com.ranganayaki.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.ranganayaki.myapplication.databinding.ActivityMainBinding
import com.ranganayaki.myapplication.recgrd.RecGrdFragment
import com.ranganayaki.myapplication.recgrd.SharedViewModel
import com.ranganayaki.myapplication.recgrd.TraditionalFragment

class MainActivity : AppCompatActivity() {

    val viewModel : SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = viewModel
        binding.lifecycleOwner = this

        viewModel.appData.observe(this) {
            supportFragmentManager.commit {
                replace<RecGrdFragment>(R.id.fragmentContainerView)
            }
        }

        traditionalWayOfPassingData()
    }

    private fun traditionalWayOfPassingData() {

        supportFragmentManager.commit {
            val frag = TraditionalFragment()
            val bundle = Bundle()
            bundle.putString("onadajfdfskjdsjdah", "red")
            bundle.putString("zmxnvxcmjtdsusfy", "#ff0000")
            frag.setArguments(bundle)
            replace(R.id.fragmentContainerView, frag)
        }
    }
}