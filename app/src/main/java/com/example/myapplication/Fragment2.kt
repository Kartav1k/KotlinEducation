package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class Fragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        val imageBut: ImageButton = view.findViewById(R.id.imageBut)
        val text1: TextView = view.findViewById(R.id.textView)
        val buttonBackToFragment1FromFragment2: Button = view.findViewById(R.id.backTo1From2)
        buttonBackToFragment1FromFragment2.setOnClickListener{
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            val fragment1 = Fragment1()
            fragmentTransaction.replace(R.id.fragment_container, fragment1)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        imageBut.setOnClickListener{
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