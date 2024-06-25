package com.example.weather

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weather.ui.theme.screens.DetailScreen
import com.example.weather.ui.theme.screens.ForeCastScreen
import com.example.weather.ui.theme.screens.HomeScreen
import com.example.weather.ui.theme.screens.HomeSizeBarScreen
import com.example.weather.ui.theme.screens.SplashScreen


enum class CloudyScreen {
    SPLASH,
    HOMESCREEN,
    HOMESIDEBAR,
    SEARCHSCREEN,
    FORECASTSCREEN,
    DETAIL,
}
@Composable
fun CloudyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = CloudyScreen.HOMESCREEN.name) {
        composable(CloudyScreen.HOMESCREEN.name) {
            HomeScreen(navController = navController)
        }
        composable(CloudyScreen.SPLASH.name) {
            SplashScreen(navController = navController)
        }
        composable(CloudyScreen.HOMESIDEBAR.name) {
            HomeSizeBarScreen(navController = navController)
        }
        composable(CloudyScreen.FORECASTSCREEN.name) {
            ForeCastScreen(navController = navController)
        }
        composable(CloudyScreen.DETAIL.name) {
            DetailScreen(navController = navController)
        }
    }
}