package com.example.jetpackcompose

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewStory()
        }
    }
}

@Composable
fun NewStory() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .height(34.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop

        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            "First textView",
            color = Color.Blue,
            style = typography.h2

        )
        Text(
            "Second textView this is a long paragraph blah blah blah",
            style = typography.body1,
            maxLines = 2
        )
        Text("Third textView")
    }
}

@Preview
@Composable
fun PreviewGreeting() {
    NewStory()
}


