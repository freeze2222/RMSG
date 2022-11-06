package com.rms.rmsg.ui.nav

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.rms.rmsg.R

sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val title: String
) {
    object MainScreen : BottomNavItem(
        route = Screen.MainScreen.route,
        icon = Icons.Default.PlayArrow,
        title = "Play"
    )

    object EditScreen : BottomNavItem(
        route = Screen.EditScreen.route,
        icon = Icons.Default.Build,
        title = "Edit"
    )
}