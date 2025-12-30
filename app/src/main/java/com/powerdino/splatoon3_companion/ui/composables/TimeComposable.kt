package com.powerdino.splatoon3_companion.ui.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import kotlin.time.Duration.Companion.hours
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

@OptIn(ExperimentalTime::class)
@Composable
fun TimeComposable(
    time:String
){
    val instant = Instant.parse(time)

    val currentTime = instant + 1.hours
    Text(
        text = currentTime.toString()
            .substringAfterLast("T")
            .replace("Z",""),
    )
}