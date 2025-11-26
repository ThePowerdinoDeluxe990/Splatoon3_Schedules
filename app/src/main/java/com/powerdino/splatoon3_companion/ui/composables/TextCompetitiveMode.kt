package com.powerdino.splatoon3_companion.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.powerdino.splatoon3_companion.data.lists.CompetitiveModesList

@Composable
fun TextCompetitiveMode(
    competitiveMode:String
){
    var nameOfMode = ""
    var imageOfMode = 0

    when(competitiveMode){
        "Goal" -> {
            nameOfMode = stringResource(CompetitiveModesList[1].nameState)
            imageOfMode = CompetitiveModesList[1].imageState
        }
        "Lift" ->{
            nameOfMode = stringResource(CompetitiveModesList[3].nameState)
            imageOfMode = CompetitiveModesList[3].imageState
        }
        "Clam"-> {
            nameOfMode = stringResource(CompetitiveModesList[2].nameState)
            imageOfMode = CompetitiveModesList[2].imageState
        }
        "Area"->{
            nameOfMode = stringResource(CompetitiveModesList[0].nameState)
            imageOfMode = CompetitiveModesList[0].imageState
        }
    }
    Row(
        modifier = Modifier.padding(
            vertical = 4.dp,
            horizontal = 8.dp
        ),
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text= nameOfMode,
            style = MaterialTheme.typography.titleMedium,
        )

        Image(
            painter = painterResource(imageOfMode),
            contentDescription = nameOfMode,
            modifier = Modifier
                .padding(horizontal = 8.dp)
        )
    }
}


@Preview
@Composable
fun PreviewTextCompetitiveMode(){
    TextCompetitiveMode(
        competitiveMode = "Area"
    )
}