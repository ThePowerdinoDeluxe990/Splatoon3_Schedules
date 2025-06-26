package com.powerdino.splatoon3_companion.ui.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.powerdino.splatoon3_companion.Model.Data
import com.powerdino.splatoon3_companion.SplatoonAppContainer
import com.powerdino.splatoon3_companion.data.SplatoonRepository
import kotlinx.coroutines.launch

sealed interface NetworkState {
    data class Success(val data:Data):NetworkState
    object Error:NetworkState
    object Loading:NetworkState
}


class SplatoonViewModel(private val splatoonRepository: SplatoonRepository): ViewModel() {
    var splatoonNetworkState:NetworkState by mutableStateOf( NetworkState.Loading)
        private set

    init {
        getSplatoonData()
    }

    fun getSplatoonData(){
        viewModelScope.launch {
            splatoonNetworkState= NetworkState.Loading
            splatoonNetworkState = try{
                NetworkState.Success(
                    splatoonRepository.getSplatoonData()
                )
            }catch (e:java.io.IOException){
                NetworkState.Error
            }
        }
    }

    companion object{
        val Factory:ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application= (this[APPLICATION_KEY] as SplatoonAppContainer)
                val splatoonRepository = application.container.splatoonRepository
                SplatoonViewModel(splatoonRepository = splatoonRepository)
            }
        }
    }
}