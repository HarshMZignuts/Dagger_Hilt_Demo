package com.example.dagger_hilt_demo.demo

import android.util.Log
import javax.inject.Inject

class Engine {

    @Inject
    constructor()
    fun getEngine()
    {
        Log.d("Main","Engine is Starting....")
    }
}