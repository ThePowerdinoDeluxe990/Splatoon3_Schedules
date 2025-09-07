package com.powerdino.splatoon3_companion.widgets

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.glance.GlanceId
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.text.Text

class SplatoonAppWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
       provideContent {
           MyContent()
       }
    }

    @Composable
    private fun MyContent(){
        Text("Hello world")
    }
}