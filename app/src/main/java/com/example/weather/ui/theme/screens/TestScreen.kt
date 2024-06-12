package com.example.weather.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.weather.R
import java.lang.reflect.Modifier

@Composable
fun TestScreen() {
    Column(modifier = androidx.compose.ui.Modifier.fillMaxSize(1f), horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.sun), contentDescription = null)
    }
}

@Preview
@Composable
fun TestScreenPreview() {
    Surface {
    TestScreen()
    }
}