package com.example.dagger_hilt_demo.demo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine,private val wheel: Wheel){


    fun getCar()
    {
        engine.getEngine()
        wheel.getWheel()
        Log.d("main","Car is Running")
    }
}