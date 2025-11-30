package com.powerdino.splatoon3_companion.widgets

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Box
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.padding
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import com.powerdino.splatoon3_companion.data.DefaultAppContainer
import com.powerdino.splatoon3_companion.data.lists.listOfMpMaps
import com.powerdino.splatoon3_companion.model.Normal
import com.powerdino.splatoon3_companion.widgets.composables.MapCardWidget
import kotlin.time.ExperimentalTime
import kotlin.time.Instant


class SplatoonAppWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        val appRepository = DefaultAppContainer()
        val splatoonData = appRepository.splatoonRepository.getSplatoonData()

        provideContent {
            GlanceTheme() {
                MyContent(
                    maps = splatoonData.normal
                )
            }
       }
    }

@OptIn(ExperimentalTime::class)
@Composable
private fun MyContent(
    maps: List<Normal>
){

  maps.forEachIndexed { index, items ->
      val instant = Instant.parse(items.startTime)
      val secondInstant = Instant.parse(items.endTime)
      if (index == 0) {
          Column(
              modifier = GlanceModifier.background(
                  GlanceTheme.colors.background
              )
          ) {
              Row(
                  modifier = GlanceModifier.padding(start = 2.dp)
                      .fillMaxWidth() ,
                  verticalAlignment = Alignment.CenterVertically,
                  horizontalAlignment = Alignment.CenterHorizontally
              ) {
                  Text(
                      text = instant.toString()
                          .substringAfterLast("T")
                          .replace("Z",""),
                      style = TextStyle(
                          color = GlanceTheme.colors.onSurface,
                          fontWeight = FontWeight.Bold
                      )
                  )
                  Text(" ")
                  Text(
                      text = secondInstant.toString()
                          .substringAfterLast("T")
                          .replace("Z",""),
                      style = TextStyle(
                          color = GlanceTheme.colors.onSurface,
                          fontWeight = FontWeight.Bold
                      )
                  )
              }

              Row(
                  verticalAlignment = Alignment.CenterVertically,
                  horizontalAlignment = Alignment.CenterHorizontally,
                  modifier = GlanceModifier.fillMaxWidth()
                  ) {
                  items.regular.stages.forEach { it ->
                      Row() {
                          Box(
                              modifier = GlanceModifier.padding(horizontal = 4.dp)
                          ) {
                              MapCardWidget(
                                  _root_ide_package_.androidx.glance.LocalContext.current.getString(
                                      listOfMpMaps[it - 1].nameState
                                  ),

                                  mapImage = listOfMpMaps[it - 1].imageState
                              )
                          }
                      }
                  }
              }
          }
      }
  }
  }
}