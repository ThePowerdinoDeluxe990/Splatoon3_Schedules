package com.powerdino.splatoon3_companion.ui.screens.routes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.powerdino.splatoon3_companion.data.listOfMpMaps
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
                items.regular.stages.forEach {it ->
                    Text(stringResource(listOfMpMaps[it-1].nameState))
                    Image(

                        painter = painterResource(listOfMpMaps[it-1].imageState),
                        contentDescription = stringResource(listOfMpMaps[it-1].nameState)
                    )
                }
            }
        }
    }
}