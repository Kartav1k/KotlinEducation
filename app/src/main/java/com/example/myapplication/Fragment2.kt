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
import androidx.navigation.fragment.findNavController


class Fragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonBackToFragment1FromFragment2: Button = view.findViewById(R.id.backTo1From2)
        val imageBut: ImageButton = view.findViewById(R.id.imageBut)
        buttonBackToFragment1FromFragment2.setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment1);
            /*val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            val fragment1 = Fragment1()
            fragmentTransaction.replace(R.id.fragment_container, fragment1)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()*/
        }
        imageBut.setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment3);
            /*val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            val fragment3 = Fragment3()
            fragmentTransaction.replace(R.id.fragment_container, fragment3)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()*/
        }
    }
}