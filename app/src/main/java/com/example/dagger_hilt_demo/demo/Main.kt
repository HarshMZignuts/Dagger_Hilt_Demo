package com.example.dagger_hilt_demo.demo

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier

class Main @Inject constructor(
    @Fname
    private val fName : String,
    @Lname
    private val lName: String){

    fun getName(){
        Log.d("Main","My name is $fName $lName")
    }

}

@Module
@InstallIn(SingletonComponent::class)
class ModuleApp{

    @Provides
    @Fname
    fun getFName() : String = "Harsh"
    @Provides
    @Lname
    fun getLName() : String = "Mistry"
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Fname

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Lname