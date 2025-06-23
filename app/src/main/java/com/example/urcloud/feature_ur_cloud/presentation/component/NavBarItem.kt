package com.example.urcloud.feature_ur_cloud.presentation.component

import androidx.compose.ui.graphics.vector.ImageVector

data class NavBarItem(
    val label:String,
    val selectedIcon: ImageVector,
    val unselectIcon: ImageVector,
    val route:String
)