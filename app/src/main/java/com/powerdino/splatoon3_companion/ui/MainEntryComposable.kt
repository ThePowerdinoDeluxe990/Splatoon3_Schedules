package com.powerdino.splatoon3_companion.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.powerdino.splatoon3_companion.ui.ViewModel.NetworkState
import com.powerdino.splatoon3_companion.ui.ViewModel.SplatoonViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainEntryComposable(){
    val splatoonViewModel:SplatoonViewModel=
        viewModel(factory = SplatoonViewModel.Factory)
    val networkStateAndInfo: NetworkState =
        splatoonViewModel.splatoonNetworkState


    NetworkComposable(
        splatoonViewModel = splatoonViewModel,
        networkState = networkStateAndInfo
    )
}


