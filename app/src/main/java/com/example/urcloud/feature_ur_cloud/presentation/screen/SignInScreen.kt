package com.example.urcloud.feature_ur_cloud.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.urcloud.R
import com.example.urcloud.feature_ur_cloud.presentation.component.SignInButton

@Composable
fun SignInScreen(
    onSignInClick:()->Unit
){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.cloud), contentDescription = "Logo")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Welcome to URCloud")
        Spacer(modifier = Modifier.height(16.dp))
        SignInButton(onClick = onSignInClick)

    }
}