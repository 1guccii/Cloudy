package com.example.weather.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.weather.CloudyScreen
import com.example.weather.domain.weather.WeatherType
import com.example.weather.ui.theme.Typography
import java.time.LocalDate
import java.time.LocalDateTime


@Composable
fun BoxForecastPerHour(navController: NavController) {
    val time = LocalDate.now().dayOfWeek
    Column(
        modifier = Modifier
            .width(350.dp)
            .height(230.dp)
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(20.dp))
            .clickable { navController.navigate(CloudyScreen.FORECASTSCREEN.name) }
    ) {
        Column(
            modifier = Modifier.padding(start = 18.dp, top = 24.dp )
        ) {
            Text(text = WeatherType.SunShowers.weatherDesc, style = Typography.titleSmall, color = Color.Black)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = time.toString(), style = Typography.bodySmall)
            Spacer(modifier = Modifier.height(12.dp))
            Row {
                VerticalForecastPerHour(time = LocalDateTime.now(), indexTime = LocalDateTime.now())
                Spacer(modifier = Modifier.width(18.dp))
                VerticalForecastPerHour(time = LocalDateTime.now().plusHours(1), indexTime = LocalDateTime.now().plusHours(1))
                Spacer(modifier = Modifier.width(18.dp))
                VerticalForecastPerHour(time = LocalDateTime.now().plusHours(2),indexTime = LocalDateTime.now().plusHours(2))
                Spacer(modifier = Modifier.width(18.dp))
                VerticalForecastPerHour(time = LocalDateTime.now().plusHours(3),indexTime = LocalDateTime.now().plusHours(3))
                Spacer(modifier = Modifier.width(18.dp))
                VerticalForecastPerHour(time = LocalDateTime.now().plusHours(4),indexTime = LocalDateTime.now().plusHours(4))
            }
        }
    }
}

@Preview
@Composable
fun VerticalWeatherPerDayPreview() {
    BoxForecastPerHour(navController = rememberNavController())
}