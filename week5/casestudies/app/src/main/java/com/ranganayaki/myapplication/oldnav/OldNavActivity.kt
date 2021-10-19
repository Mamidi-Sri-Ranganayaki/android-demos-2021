package com.ranganayaki.myapplication.oldnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.ranganayaki.myapplication.R

class OldNavActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_old_nav)
    }

    fun loadFragment( frag : Fragment) {
        supportFragmentManager.commit {
            replace(R.id.fcv, frag)
            addToBackStack(frag.javaClass.canonicalName)
        }
    }
}