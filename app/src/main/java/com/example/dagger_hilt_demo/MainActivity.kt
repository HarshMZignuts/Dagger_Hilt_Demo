package com.example.dagger_hilt_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger_hilt_demo.demo.Car
import com.example.dagger_hilt_demo.demo.Main
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    //lateinit var car: Car
    lateinit var main : Main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //car.getCar()
        main.getName()
    }
}