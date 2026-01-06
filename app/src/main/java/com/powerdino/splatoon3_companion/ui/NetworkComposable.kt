package com.powerdino.splatoon3_companion.ui

import androidx.compose.runtime.Composable
import com.powerdino.splatoon3_companion.ui.viewModels.NetworkState
import com.powerdino.splatoon3_companion.ui.viewModels.SplatoonViewModel
import com.powerdino.splatoon3_companion.ui.screens.ErrorScreen
import com.powerdino.splatoon3_companion.ui.screens.LoadingScreen
import com.powerdino.splatoon3_companion.ui.screens.SuccessScreen

@Composable
fun NetworkComposable(
    networkState: NetworkState,
){
    when(networkState){
        is NetworkState.Success -> {
            SuccessScreen(
                splatoonData = networkState.data,
                salmonResources = networkState.salmonResources,
                salmonSchedules = networkState.salmonSchedules,
                versusResources = networkState.versusResources
            )
        }
        is NetworkState.Loading -> {
            LoadingScreen()
        }
        is NetworkState.Error -> {
            ErrorScreen()
        }
    }
}