package com.powerdino.splatoon3_companion.ui.screens.routes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.powerdino.splatoon3_companion.data.listOfMpMaps
import com.powerdino.splatoon3_companion.model.Data
import com.powerdino.splatoon3_companion.ui.composables.MapCard
import com.powerdino.splatoon3_companion.ui.composables.TextSchedule

@Composable
fun CompetitiveBattlesScreen (
    splatoonNormal: Data
){
    Column {
        Text("Competitive Stages")
        LazyColumn {
            itemsIndexed(splatoonNormal.normal){index, items ->
                Text(items.bankara.rule)

                TextSchedule(index)

                items.bankara.stages.forEach {it ->
                    Box(
                        modifier = Modifier.padding(horizontal = 8.dp)
                    ){
                        MapCard(
                            mapName = stringResource(listOfMpMaps[it-1].nameState),
                            mapImage = listOfMpMaps[it-1].imageState
                        )

                    }
                    Spacer(
                        modifier = Modifier.padding(12.dp)
                    )
                }

                items.bankaraOpen.stages.forEach { it ->
                    Box(
                        modifier = Modifier.padding(horizontal = 8.dp)
                    ){
                        MapCard(
                            mapName = stringResource(listOfMpMaps[it-1].nameState),
                            mapImage = listOfMpMaps[it-1].imageState
                        )

                    }
                    Spacer(
                        modifier = Modifier.padding(12.dp)
                    )
                }
            }
        }
    }
}