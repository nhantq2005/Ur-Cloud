package com.example.urcloud.feature_ur_cloud.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Audiotrack
import androidx.compose.material.icons.filled.FilePresent
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.InsertDriveFile
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.urcloud.ui.theme.UrCloudTheme
import com.example.urcloud.util.Responsive

@Composable
fun FileItem(fileName: String) {
    val audioExtension = listOf(
        ".mp3",
        ".wav",
        ".wma",
        ".aac",
        ".ogg",
        ".flac",
        ".alac",
        ".aiff",
        ".m4a",
        ".opus",
        ".mid",
        ".midi",
        ".amr",
        ".ra",
        ".rm",
        ".dsd",
        ".dff",
        ".dsf",
        ".pcm",
        ".vox"
    )
    val videoExtension = listOf(
        ".mp4",
        ".mkv",
        ".avi",
        ".mov",
        ".flv",
        ".wmv",
        ".webm",
        ".3gp",
        ".mpeg",
        ".mpg",
        ".m4v",
        ".ts",
        ".vob",
        ".ogv",
        ".rm",
        ".rmvb"
    )
    val imageExtension = listOf(
        ".jpg",
        ".jpeg",
        ".png",
        ".gif",
        ".bmp",
        ".tiff",
        ".tif",
        ".webp",
        ".svg",
        ".heic",
        ".ico",
        ".raw",
        ".cr2",
        ".nef",
        ".psd",
        ".ai"
    )
    val documentExtension = listOf(
        ".txt",
        ".doc",
        ".docx",
        ".pdf",
        ".rtf",
        ".odt",
        ".md",
        ".tex",
        ".log",
        ".csv",
        ".tsv",
        ".xml",
        ".json",
        ".yaml",
        ".yml",
        ".ini"
    )
    Column(
        modifier = Modifier
//            .shadow(8.dp, RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .height(Responsive.scaledDp(180))
            .padding(5.dp)
            .pointerInput(Unit) {
                detectTapGestures(
                    onLongPress = {
//                        showSheet = true
                    }
                )
            }
//            .clip(RoundedCornerShape(10.dp))
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight(0.8f)
                .background(Color.LightGray)
                .clip(RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center
        ) {
            Icon(imageVector =
            if (audioExtension.any { token -> fileName.endsWith(token) })
                Icons.Default.Audiotrack
            else if (videoExtension.any { token -> fileName.endsWith(token) })
                Icons.Default.Movie
            else if (imageExtension.any { token -> fileName.endsWith(token) })
                Icons.Default.Image
            else if (documentExtension.any { token -> fileName.endsWith(token) })
                Icons.Default.InsertDriveFile
            else
                Icons.Default.QuestionMark,
                contentDescription = "File Icon",
                modifier = Modifier
                    .size(Responsive.scaledDp(100))

            )

        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(imageVector = Icons.Default.FilePresent, contentDescription = "File Icon")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = fileName, style = MaterialTheme.typography.bodyMedium.copy(
                fontSize = Responsive.scaledSp(18),
                fontWeight = FontWeight.SemiBold
            ))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewFileItem() {
    UrCloudTheme {
        FileItem("test.mp4")
    }
}