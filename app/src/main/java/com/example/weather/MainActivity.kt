package com.example.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.weather.ui.theme.WeatherTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherTheme {
                CloudyApp()
            }
        }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherTheme {
        }
    }
}