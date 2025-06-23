package com.example.urcloud.feature_ur_cloud.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.urcloud.feature_ur_cloud.presentation.navigation.Screen
import com.example.urcloud.feature_ur_cloud.presentation.screen.AccountScreen
import com.example.urcloud.feature_ur_cloud.presentation.screen.MyCloudScreen
import com.example.urcloud.feature_ur_cloud.presentation.screen.SharedScreen
import com.example.urcloud.ui.theme.UrCloudTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UrCloudTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController, startDestination = Screen.MyCloud.route
                ){
                    composable(Screen.MyCloud.route){
                        MyCloudScreen(navController = navController)
                    }
                    composable(Screen.Shared.route){
                        SharedScreen(navController = navController)
                    }
                    composable(Screen.Account.route){
                        AccountScreen(navController = navController)
                    }

                }
            }
        }
    }
}
