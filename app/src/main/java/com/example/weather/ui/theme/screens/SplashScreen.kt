package com.example.weather.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.weather.R
import com.example.weather.ui.theme.Typography
import com.example.weather.ui.theme.linearColorList

@Composable
fun SplashScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.linearGradient(colors = linearColorList))

    ) {
            Image(painter = painterResource(id = R.drawable.cloud), contentDescription = null, modifier = Modifier.scale(2.5f))
            Text(text = stringResource(id =R.string.app_name), style = Typography.headlineLarge)
    }
}


@Preview
@Composable
fun SplashScreenPreview() {
    Surface {
        SplashScreen()
    }
}