package com.powerdino.splatoon3_companion.ui

import androidx.compose.runtime.Composable
import com.powerdino.splatoon3_companion.ui.ViewModel.NetworkState
import com.powerdino.splatoon3_companion.ui.ViewModel.SplatoonViewModel
import com.powerdino.splatoon3_companion.ui.screens.ErrorScreen
import com.powerdino.splatoon3_companion.ui.screens.LoadingScreen
import com.powerdino.splatoon3_companion.ui.screens.SuccessScreen

@Composable
fun NetworkComposable(
    splatoonViewModel: SplatoonViewModel,
    networkState: NetworkState,
){
    when(networkState){
        is NetworkState.Success -> {
            SuccessScreen(
                splatoonData = networkState.data,
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