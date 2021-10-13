package com.ranganayaki.jetpackapps.archcomp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ranganayaki.jetpackapps.R
import com.ranganayaki.jetpackapps.databinding.ActivityVmDemoBinding
import java.util.*
// ActivityVmDemoBinding
class VmDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // from this time you will not use findViewById
        val binding = ActivityVmDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var isVs = false
        binding.btDtNw.setOnClickListener {
            binding.txDtNw.setText(Date().toString())

           binding.pbDm.visibility = if(isVs) View.INVISIBLE else View.VISIBLE
            isVs = isVs.not()  // false become true, true becomes false
        }
    }
}