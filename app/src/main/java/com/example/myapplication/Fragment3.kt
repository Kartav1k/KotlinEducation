package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class Fragment3 : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_3, container, false)
        val buttonBackToFragment1FromFragment3: Button = view.findViewById(R.id.backTo1From3)
        buttonBackToFragment1FromFragment3.setOnClickListener{
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            val fragment1 = Fragment1()
            fragmentTransaction.replace(R.id.fragment_container, fragment1)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        return view
    }

}