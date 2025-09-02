package com.powerdino.splatoon3_companion.ui.screens.routes

import kotlinx.serialization.Serializable

sealed class Routes(){
    @Serializable
    object RegularBattlesScreen
}