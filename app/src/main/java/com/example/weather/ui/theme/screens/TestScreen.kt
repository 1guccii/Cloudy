package com.example.weather.ui.theme.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.weather.ui.theme.Typography
import com.example.weather.viemodel.WeatherViewModel

@Composable
fun TestScreen(viewModel: WeatherViewModel) {
    viewModel.getWeatherData(233.4,5344.4)
    Column(
        modifier = Modifier.fillMaxSize(1f).background(Color.White)
    ) {
        Text(text = "", style = Typography.displayLarge)
    }
}
@Preview
@Composable
fun TestScreenPreview() {
    Column(
        modifier = Modifier.fillMaxSize(1f)
    ) {

    }
}

