package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class Fragment1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        val image1: ImageView = view.findViewById(R.id.imageView)
        val buttonToFragment2: Button = view.findViewById(R.id.button1)
        val buttonToFragment3: Button = view.findViewById(R.id.button2)
        buttonToFragment2.setOnClickListener {
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            val fragment2 = Fragment2()
            fragmentTransaction.replace(R.id.fragment_container, fragment2)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        buttonToFragment3.setOnClickListener {
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            val fragment3 = Fragment3()
            fragmentTransaction.replace(R.id.fragment_container, fragment3)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        return view
    }
}