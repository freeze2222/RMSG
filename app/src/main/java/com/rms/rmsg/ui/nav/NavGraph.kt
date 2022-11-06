@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package com.rms.rmsg.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rms.rmsg.ui.screens.EditScreen
import com.rms.rmsg.ui.screens.MainScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route){
            MainScreen()
        }
        composable(route = Screen.EditScreen.route){
            EditScreen()
        }
    }
}