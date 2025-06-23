package com.example.urcloud.feature_ur_cloud.presentation.component

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material.icons.filled.CloudQueue
import androidx.compose.material.icons.filled.FolderShared
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.FolderShared
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.urcloud.feature_ur_cloud.presentation.navigation.Screen
import com.example.urcloud.util.Responsive


@Composable
fun NavBar(
    navController: NavController,
    content:@Composable ()->Unit
){
    //Items in navbar
    val items = listOf(
        NavBarItem(
            label = Screen.MyCloud.label,
            selectedIcon = Icons.Default.Cloud,
            unselectIcon = Icons.Default.CloudQueue,
            route = Screen.MyCloud.route
        ),
        NavBarItem(
            label = Screen.Shared.label,
            selectedIcon = Icons.Filled.FolderShared,
            unselectIcon = Icons.Outlined.FolderShared,
            route = Screen.Shared.route
        ),
        NavBarItem(
            label = Screen.Account.label,
            selectedIcon = Icons.Filled.AccountCircle,
            unselectIcon = Icons.Outlined.AccountCircle,
            route = Screen.Account.route
        )

    )


    Scaffold(
        bottomBar = {
            NavigationBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp)),
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                tonalElevation = 5.dp,
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    items.forEachIndexed { _, item ->
                        val currenRoute = navController.currentDestination?.route
                        NavigationBarItem(
                            selected = currenRoute == item.route,


                            onClick = {
                                navController.navigate(item.route)
                            },
                            icon = {
                                if (currenRoute == item.route) {
                                    Icon(
                                        item.selectedIcon,
                                        contentDescription = "Navigation Icon",
                                        modifier = Modifier.size(Responsive.scaledDp(25))
                                    )
                                } else {
                                    Icon(
                                        item.unselectIcon,
                                        contentDescription = "Navigation Icon",
                                        modifier = Modifier.size(Responsive.scaledDp(25))
                                    )

                                }
                            },
                            label = {
                                Text(
                                    text = item.label,
                                    style = MaterialTheme.typography.labelMedium.copy(
                                        fontWeight = FontWeight.Medium
                                    )
                                )
                            }
                        )
                    }
                }
            }
        }
    ){innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)){
            content()
        }
    }
}