package com.example.urcloud.feature_ur_cloud.presentation.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.urcloud.feature_ur_cloud.presentation.component.NavBar

@Composable
fun SharedScreen(
    navController: NavController
) {
    NavBar(navController) {
        Text(text = "Shared Screen")
    }
}