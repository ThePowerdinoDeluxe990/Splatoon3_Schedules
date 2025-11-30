package com.powerdino.splatoon3_companion.widgets.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.Image
import androidx.glance.ImageProvider
import androidx.glance.appwidget.cornerRadius
import androidx.glance.layout.Alignment
import androidx.glance.layout.Box
import androidx.glance.layout.ContentScale
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.layout.size
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle


@Composable
fun MapCardWidget(
    mapName:String,
    mapImage:Int,
){
    Box(
        modifier = GlanceModifier.size(128.dp)

    ){
        Image(
            provider = ImageProvider(mapImage),
            contentDescription = mapName,
            contentScale = ContentScale.FillBounds,
            modifier = GlanceModifier.cornerRadius(4.dp)

        )

        Box(
            modifier = GlanceModifier.fillMaxSize(),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(
                text=mapName,
                modifier = GlanceModifier.padding(2.dp),
                maxLines = 2,

                style = TextStyle(
                    color = GlanceTheme.colors.surface,
                    fontWeight = FontWeight.Bold
                )
            )
        }

    }
}
