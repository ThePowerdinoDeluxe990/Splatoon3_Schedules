package com.powerdino.splatoon3_companion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import com.powerdino.splatoon3_companion.ui.MainEntryComposable
import com.powerdino.splatoon3_companion.ui.theme.Splatoon3_CompanionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Splatoon3_CompanionTheme {
                Box(
                    modifier = Modifier.background(
                        MaterialTheme.colorScheme.surface
                    )
                ){
                    MainEntryComposable()
                }
            }
        }
    }
}

