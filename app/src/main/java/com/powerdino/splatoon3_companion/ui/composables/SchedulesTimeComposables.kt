package com.powerdino.splatoon3_companion.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.powerdino.splatoon3_companion.R

@Composable
fun SchedulesTimeComposables(
    startsAt:String,
    endsAt:String
){
    Column(
        modifier = Modifier.padding(
            vertical = 1.dp,
            horizontal = 8.dp
        )
    ){
        Row(){
            Text(
                text = stringResource(R.string.start ) + " ",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            )
            TimeComposable(startsAt)
        }

        Row(){
            Text(
                text = stringResource(R.string.end ) + " ",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            )
            TimeComposable(endsAt)
        }
    }
}