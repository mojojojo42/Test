package com.example.test.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test.util.OnNotificationReceivedListener
import com.example.test.R

class MainActivity : AppCompatActivity(),
    OnNotificationReceivedListener {

    private val fragA by lazy { FragmentA() }
    private val fragB by lazy { FragmentB() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        setFragments()
    }

    private fun setFragments() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frag_a, fragA)
            .replace(R.id.frag_b, fragB)
            .commit()
    }

    override fun onNotificationReceived(data: String) {
        fragB.onNotificationReceived(data)
    }
}