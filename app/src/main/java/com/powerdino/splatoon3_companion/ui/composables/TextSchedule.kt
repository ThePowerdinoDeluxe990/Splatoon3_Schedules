package com.powerdino.splatoon3_companion.ui.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.powerdino.splatoon3_companion.R

@Composable
fun TextSchedule(
    index:Int
){
    val textSchedule:String = when(index){
        0 -> stringResource(R.string.current)
        else -> stringResource(R.string.next)
    }

    Text(
        text = textSchedule,
        style = MaterialTheme.typography.displaySmall,
        modifier = Modifier.padding(8.dp),
        fontWeight = FontWeight.Bold
    )
}