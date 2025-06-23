package com.example.urcloud.feature_ur_cloud.presentation.navigation

sealed class Screen(
    val label:String,
    val route: String
) {
    data object MyCloud: Screen("My Cloud", "mycloud")
    data object Shared: Screen("Shared", "shared")
    data object Account: Screen("Account", "account")
    data object SignIn: Screen("Sign In", "sigin")


}