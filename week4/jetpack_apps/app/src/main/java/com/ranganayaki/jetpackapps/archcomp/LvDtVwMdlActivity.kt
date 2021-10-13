package com.ranganayaki.jetpackapps.archcomp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.ranganayaki.jetpackapps.R
import com.ranganayaki.jetpackapps.databinding.ActivityLvDtVwMdlBinding

class LvDtVwMdlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLvDtVwMdlBinding = DataBindingUtil.setContentView(this, R.layout.activity_lv_dt_vw_mdl)

        val viewModel: LvDtVmViewModel by viewModels()
        binding.vm = viewModel
        binding.lifecycleOwner = this

    }
}

/*abstract class Animal

class Tiger : Animal() {
    fun hiTiger() { }
}

fun diff() {
    val an: Animal = Tiger()
}*/
