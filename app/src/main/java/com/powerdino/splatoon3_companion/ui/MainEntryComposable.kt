package com.powerdino.splatoon3_companion.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.powerdino.splatoon3_companion.R
import com.powerdino.splatoon3_companion.ui.ViewModel.NetworkState
import com.powerdino.splatoon3_companion.ui.ViewModel.SplatoonViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainEntryComposable(){
    val splatoonViewModel:SplatoonViewModel=
        viewModel(factory = SplatoonViewModel.Factory)
    val networkStateAndInfo: NetworkState =
        splatoonViewModel.splatoonNetworkState

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                ),
                title = {
                    Text(stringResource(id = R.string.app_name))
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            NetworkComposable(
                splatoonViewModel = splatoonViewModel,
                networkState = networkStateAndInfo
            )
        }
    }

}