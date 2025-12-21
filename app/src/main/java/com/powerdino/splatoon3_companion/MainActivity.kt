package com.powerdino.splatoon3_companion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.powerdino.splatoon3_companion.ui.MainEntryComposable
import com.powerdino.splatoon3_companion.ui.theme.Splatoon3_CompanionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Splatoon3_CompanionTheme {
                MainEntryComposable()
            }
        }
    }
}

