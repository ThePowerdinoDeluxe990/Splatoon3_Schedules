package com.powerdino.splatoon3_companion.ui.screens.routes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.powerdino.splatoon3_companion.model.Data

@Composable
fun RegularBattlesScreen (
    splatoonNormal: Data
){
    Column {
        Text("Normal Stages")
        LazyColumn {
            items(splatoonNormal.normal){ items ->
                Text(items.regular.rule)
                items.regular.stages.forEach { it ->
                    Text(it.toString())
                }
            }
        }
    }
}