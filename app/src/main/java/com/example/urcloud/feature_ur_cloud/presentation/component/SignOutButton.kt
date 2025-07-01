package com.example.urcloud.feature_ur_cloud.presentation.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SignOutButton(
    onClick: () -> Unit
){
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth()
    ){
        Row {
            Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "Sign Out")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Sign Out")
        }

    }
}
