package com.powerdino.splatoon3_companion.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.powerdino.splatoon3_companion.model.Data
import com.powerdino.splatoon3_companion.ui.screens.routes.RegularBattlesScreen
import com.powerdino.splatoon3_companion.ui.screens.routes.Routes

@Composable
fun SuccessScreen(
    splatoonData: Data
){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.RegularBattlesScreen
    ){
       composable<Routes.RegularBattlesScreen>{
           RegularBattlesScreen(
                splatoonNormal = splatoonData
           )
       }
    }

}