package com.fascinate98.groom

import android.app.Application
import androidx.compose.runtime.mutableStateOf
import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class GroomApplication : Application(){
    val myCoin = mutableStateOf(null)
    val myName = mutableStateOf(null)


}