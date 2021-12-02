package com.example.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentB : Fragment(), OnNotificationReceivedListener {

    private lateinit var tv: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val mView = inflater.inflate(R.layout.b_fragment, container, false)

        tv = mView.findViewById(R.id.tv)

        return mView
    }

    override fun onNotificationReceived(data: String) {
        tv.text = data
    }
}