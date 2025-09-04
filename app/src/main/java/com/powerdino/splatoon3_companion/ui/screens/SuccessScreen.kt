package com.powerdino.splatoon3_companion.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.powerdino.splatoon3_companion.model.Data
import com.powerdino.splatoon3_companion.ui.screens.routes.CompetitiveBattlesScreen
import com.powerdino.splatoon3_companion.ui.screens.routes.RegularBattlesScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SuccessScreen(
    splatoonData: Data
){
    val navController = rememberNavController()

    var bottomSelected by rememberSaveable {
        mutableIntStateOf(0)
    }
    
    val bottomNavItems = listOf(
        BottomScreens.Versus,
        BottomScreens.Competitive
    )

    Scaffold (
        bottomBar = {
            NavigationBar {
                bottomNavItems.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = bottomSelected == index,
                        onClick = {
                            bottomSelected = index
                            navController.navigate(item.route)
                        },
                        label = {
                            Text(stringResource(item.title))
                        },
                        alwaysShowLabel = true,
                        icon = {
                            Icon(
                                painter = if (index ==  bottomSelected) {
                                    painterResource( id=item.selectedIcon)
                                } else painterResource(item.unselectedIcon),
                                contentDescription = stringResource(item.title),
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    )
                }
            }
        }
    ){ innerPadding ->
        NavHost(
            navController = navController,
            startDestination = RegularBattlesScreen
        ){
            composable<RegularBattlesScreen>{
                Box(
                    modifier = Modifier.padding(innerPadding)
                ){
                    RegularBattlesScreen(
                        splatoonNormal = splatoonData
                    )
                }

            }

            composable<CompetitiveBattlesScreen>{
                Box(
                    modifier = Modifier.padding(innerPadding)
                ){
                    CompetitiveBattlesScreen(
                        splatoonNormal = splatoonData
                    )
                }
            }
        }
    }
}