package com.example.urcloud.feature_ur_cloud.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Text
import com.example.urcloud.ui.theme.UrCloudTheme

@Composable
fun StorageBar(
    usedStorage:Float,
    maxStorage:Float
) {
    var percent:Float = usedStorage / maxStorage;
    Column(modifier = Modifier.fillMaxHeight()) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(16.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.LightGray)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(percent)
                    .height(16.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(
                        if(percent<0.8f)
                        Color.Green
                        else if (percent<0.9f)
                            Color.Magenta
                        else
                        Color.Red
                    )
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Đã sử dụng: $usedStorage MB / $maxStorage MB", style = MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.colorScheme.onSurface
        ))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewStorageBar() {
    UrCloudTheme {
        StorageBar(95f,100f)

    }
}