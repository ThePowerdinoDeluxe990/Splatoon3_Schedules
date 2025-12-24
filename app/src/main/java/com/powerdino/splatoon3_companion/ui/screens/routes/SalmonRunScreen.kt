package com.powerdino.splatoon3_companion.ui.screens.routes

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import com.powerdino.splatoon3_companion.data.lists.SalmonRunStageImage
import com.powerdino.splatoon3_companion.model.salmon_run.Salmon
import com.powerdino.splatoon3_companion.model.salmon_run.resources.SalmonResources
import com.powerdino.splatoon3_companion.ui.composables.SchedulesTimeComposables
import com.powerdino.splatoon3_companion.ui.composables.TextSchedule
import com.powerdino.splatoon3_companion.ui.screens.routes.salmonComposables.SalmonMapCard

@Composable
fun SalmonRunScreen(
    salmonResources: SalmonResources,
    salmonSchedule: Salmon
){
    LazyColumn() {
        itemsIndexed(salmonSchedule.normal){ index, items ->

            TextSchedule(index)

            SchedulesTimeComposables(
                startsAt = items.startTime,
                endsAt = items.endTime
            )

            salmonResources.stages[items.stage.toString(),]?.let {
                SalmonMapCard(
                    it,
                    SalmonRunStageImage(items.stage.toString()),
                    weaponsList = TODO()
                )
            }
        }

    }
}