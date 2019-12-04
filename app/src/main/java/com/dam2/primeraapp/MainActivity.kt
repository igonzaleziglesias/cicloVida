package com.dam2.primeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MisMensajes","Estoy en onCreate")
    }

    override fun onStart(){
        super.onStart()
        Log.d("MisMensajes","Estoy en onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.d("MisMensajes","Estoy en onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d("MisMensajes", "Estoy en onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d("MisMensajes","Estoy en onStop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d("MisMensajes", "Estoy en onDestroy")
    }



}