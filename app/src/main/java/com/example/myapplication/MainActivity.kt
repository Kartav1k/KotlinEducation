package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        val fragment1 = Fragment1()
        fragmentTransaction.replace(R.id.fragment_container, fragment1)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}

