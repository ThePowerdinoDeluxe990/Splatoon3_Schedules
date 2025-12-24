package com.powerdino.splatoon3_companion.ui.screens.routes.salmonComposables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.powerdino.splatoon3_companion.R
import kotlin.text.Typography.bullet

@Composable
fun SalmonMapCard(
    mapName:String,
    mapImage:Int,
    weaponsList:List<String>
){
    var stateOfArrow by remember {
        mutableStateOf(false)
    }

    ElevatedCard (
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        )
    ){
        Column(
        ){
            Image(
                painter = painterResource(mapImage),
                contentDescription = mapName,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
                    .size(128.dp)
            )
            Text(
                text=mapName,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(12.dp),)

            Icon(
                imageVector = when(stateOfArrow){
                    false->
                        Icons.Default.ArrowDropDown
                    else -> Icons.Default.ArrowDropUp
                },
                contentDescription = "Open",
                modifier = Modifier.clickable(
                    onClick = {stateOfArrow != stateOfArrow}
                )
            )

            if(stateOfArrow){
                val paragraphStyle = ParagraphStyle(textIndent = TextIndent(restLine = 12.sp))
                Text(
                    buildAnnotatedString {
                        weaponsList.forEach {
                            withStyle(style = paragraphStyle) {
                                append(bullet)
                                append("\t\t")
                                append(it)
                            }
                        }
                    }
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewMapCard(){
    SalmonMapCard(
        mapName = stringResource(R.string.stage1),
        mapImage = R.drawable.stage1,
        weaponsList = listOf<String>(
            "Rebelion",
            "Splattershot",
            "Splattershot",
            "Splattershot",
        )
    )
}