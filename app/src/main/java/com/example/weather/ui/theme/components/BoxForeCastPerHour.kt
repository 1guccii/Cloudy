package com.example.weather.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weather.domain.weather.WeatherType
import com.example.weather.ui.theme.Typography


@Composable
fun BoxForecastPerHour(modifier: Modifier = Modifier) {
    Column(
        modifier
            .width(350.dp)
            .height(230.dp)
            .background(color = Color(0xFFEEEEEE), shape = RoundedCornerShape(20.dp))

    ) {
        Column(
            modifier.padding(start = 24.dp, top = 24.dp )
        ) {
            Text(text = WeatherType.SunShowers.weatherDesc, style = Typography.titleSmall, color = Color.Black)
            Spacer(modifier = modifier.height(8.dp))
            Text(text = "June, 18th 2024", style = Typography.bodySmall)
            Spacer(modifier = Modifier.height(12.dp))
            Row() {
                VerticalForecastPerHour()
                Spacer(modifier = Modifier.width(18.dp))
                VerticalForecastPerHour()
                Spacer(modifier = Modifier.width(18.dp))
                VerticalForecastPerHour()
                Spacer(modifier = Modifier.width(18.dp))
                VerticalForecastPerHour()
                Spacer(modifier = Modifier.width(18.dp))
                VerticalForecastPerHour()
            }
        }
    }
}

@Preview
@Composable
fun VerticalWeatherPerDayPreview() {
    BoxForecastPerHour()
}