package com.example.dagger_hilt_demo.demo

import android.util.Log
import javax.inject.Inject

class Wheel {
    @Inject
    constructor()
    fun getWheel()
    {
        Log.d("Main","wheel is Starting....")
    }
}