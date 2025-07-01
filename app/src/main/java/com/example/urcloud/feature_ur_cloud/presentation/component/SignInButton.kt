package com.example.urcloud.feature_ur_cloud.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.OutlinedButton
import com.example.urcloud.R
import com.example.urcloud.ui.theme.UrCloudTheme

@Composable
fun SignInButton(
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(R.drawable.google), contentDescription = "Google logo")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Sign In With Google", style = MaterialTheme.typography.body1.copy(
                fontWeight = FontWeight.Medium
            ) )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSignInButton() {
    UrCloudTheme {
        SignInButton() {}
    }
}
