package com.example.urcloud.feature_ur_cloud.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.urcloud.feature_ur_cloud.presentation.component.NavBar
import com.example.urcloud.feature_ur_cloud.presentation.component.SignOutButton
import com.example.urcloud.feature_ur_cloud.presentation.state.UserData
import com.example.urcloud.ui.theme.UrCloudTheme
import com.example.urcloud.util.Responsive

@Composable
fun AccountScreen(
//    userData: UserData,
    onSignOutClick: () -> Unit,
    navController: NavController
) {
    NavBar(navController) {
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(16.dp)
        ){
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .fillMaxHeight(0.2f)
//                    .padding(16.dp),
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                userData.username?.let {
//                    Text(
//                        text = it,
//                        style = MaterialTheme.typography.headlineLarge.copy(
//                            fontSize = Responsive.scaledSp(25),
//                            fontWeight = FontWeight.Medium
//                        )
//                    )
//                }
//                AsyncImage(
//                    model =
//                        if (userData?.profilePictureUrl == null)
//                            Icons.Default.AccountCircle
//                        else
//                            userData.profilePictureUrl,
//                    contentDescription = "Profile picture",
//                    modifier = Modifier
//                        .size(Responsive.scaledDp(100))
//                        .clip(CircleShape),
//                    contentScale = ContentScale.Crop
//                )
//            }
            SignOutButton {  }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAccountScreen(){
    UrCloudTheme {
        AccountScreen(onSignOutClick = {}, rememberNavController())
    }
}
