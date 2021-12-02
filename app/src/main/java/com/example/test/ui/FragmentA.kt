package com.example.test.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.test.util.OnNotificationReceivedListener
import com.example.test.R

class FragmentA : Fragment() {

    private var counter = 0
    private lateinit var onNotificationReceivedListener: OnNotificationReceivedListener

    override fun onAttach(context: Context) {
        super.onAttach(context)

        onNotificationReceivedListener = context as OnNotificationReceivedListener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val mView = inflater.inflate(R.layout.a_fragment, container, false)

        mView.findViewById<Button>(R.id.btn).setOnClickListener {
            onNotificationReceivedListener.onNotificationReceived("Hello, World! : ${++counter}")
        }

        return mView
    }
}