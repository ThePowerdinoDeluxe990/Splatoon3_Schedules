package com.powerdino.splatoon3_companion

import android.app.Application
import com.powerdino.splatoon3_companion.data.AppContainer
import com.powerdino.splatoon3_companion.data.DefaultAppContainer

class SplatoonAppContainer:Application(){
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}