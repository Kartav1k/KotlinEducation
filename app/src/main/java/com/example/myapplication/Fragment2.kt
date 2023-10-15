package com.example.myapplication

import android.graphics.Camera
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.SurfaceHolder
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import java.io.File
import java.io.IOException



class Fragment2 : Fragment(){
    private lateinit var camera: Camera
    private lateinit var surfaceHolder: SurfaceHolder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        return view
    }
    public fun saveText(fileName: String){

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dir = File("photos")
        if(!dir.exists()) {
            if (dir.mkdir()) {
                val fileName = File(dir, "date.txt")
                fileName.createNewFile()
                try {
                    fileName.createNewFile()
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
            else{
                Log.d(TAG, "Папку создать не удалось")
            }
        }
        else{
            Log.d(TAG, "Папку уже существует")
        }
    }
}