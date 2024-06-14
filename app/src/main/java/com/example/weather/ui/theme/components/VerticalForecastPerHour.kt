package com.example.weather.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weather.R
import com.example.weather.ui.theme.Typography
import com.example.weather.ui.theme.linearColorList

@Composable
fun VerticalForecastPerHour() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(color = Color(0xFFEEEEEE)),


    ) {
        Text(text = "2 AM", style = Typography.titleSmall, color = Color.Black)
        Spacer(modifier = Modifier.height(16.dp))
        Image(painter = painterResource(id = R.drawable.sun), contentDescription = "Sun")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "73°C", style = Typography.bodySmall.copy(fontFamily = FontFamily(Font(R.font.poppins_regular))))
    }
}

@Preview
@Composable
fun PreviewVerticalForecastPerHour() {
    VerticalForecastPerHour()
}