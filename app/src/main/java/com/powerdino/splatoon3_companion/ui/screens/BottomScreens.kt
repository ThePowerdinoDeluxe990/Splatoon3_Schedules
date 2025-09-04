package com.powerdino.splatoon3_companion.ui.screens

import com.powerdino.splatoon3_companion.R
import com.powerdino.splatoon3_companion.ui.screens.routes.CompetitiveBattlesScreen
import com.powerdino.splatoon3_companion.ui.screens.routes.RegularBattlesScreen
import kotlinx.serialization.Serializable

@Serializable
sealed class BottomScreens <T>( val title: Int,
                                val selectedIcon: Int,
                                val unselectedIcon: Int,
                                val route:T,
                                val selected: Boolean ) {
    @Serializable
    data object Versus: BottomScreens<RegularBattlesScreen>(
        title = R.string.regular,
        selectedIcon = R.drawable.turfwar,
        unselectedIcon = R.drawable.turfwar,
        route = RegularBattlesScreen,
        selected = true,
    )

    @Serializable
    data object  Competitive: BottomScreens<CompetitiveBattlesScreen>(
        title = R.string.comp,
        selectedIcon = R.drawable.anarchybattle,
        unselectedIcon = R.drawable.anarchybattle,
        route = CompetitiveBattlesScreen,
        selected = true,
    )
}