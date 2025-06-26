package com.powerdino.splatoon3_companion

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.lifecycle.viewmodel.compose.viewModel
import com.powerdino.splatoon3_companion.ui.ViewModel.NetworkState
import com.powerdino.splatoon3_companion.ui.ViewModel.SplatoonViewModel
import com.powerdino.splatoon3_companion.ui.theme.Splatoon3_CompanionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Splatoon3_CompanionTheme {
                val splatoonViewModel:SplatoonViewModel=
                    viewModel(factory = SplatoonViewModel.Factory)
                var NetworkStateAndInfo: NetworkState =
                    splatoonViewModel.splatoonNetworkState


                when(NetworkStateAndInfo){
                    is NetworkState.Success -> {
                            Log.i("title",NetworkStateAndInfo.data.normal.toString())
                        }

                    else -> Log.i("nada","nada")
                }

            }
        }
    }
}

