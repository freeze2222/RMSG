package com.rms.rmsg.ui.nav

sealed class Screen(val route: String){
    object MainScreen: Screen(route = "MainScreen")
    object EditScreen: Screen(route = "EditScreen")
}