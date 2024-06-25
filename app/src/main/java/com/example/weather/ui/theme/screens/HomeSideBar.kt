package com.example.weather.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.weather.R
import com.example.weather.ui.theme.Typography
import com.example.weather.ui.theme.components.LocationTextButton
import com.example.weather.ui.theme.linearColorList

@Composable
fun HomeSizeBarScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(brush = Brush.linearGradient(colors = linearColorList))
            .fillMaxSize(1f)
    ) {
        Column(
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.current_location),
                    style = Typography.titleSmall.copy(color = Color(0xFFFFFFFF)),
                )
                LocationTextButton(location = stringResource(id = R.string.location_1)) {
                }
            }
            Spacer(modifier = Modifier.weight(2f))
            Column(
                modifier = Modifier.weight(5f),
            ) {
                LocationTextButton(location = stringResource(id = R.string.add_location)) {}
                LocationTextButton(location = stringResource(id = R.string.location_2)) {}
                LocationTextButton(location = stringResource(id = R.string.location_3)) {}
                LocationTextButton(location = stringResource(id = R.string.location_4)) {}
                LocationTextButton(location = stringResource(id = R.string.location_5)) {}
            }
        }


    }
}

@Preview
@Composable
fun HomeSizeBarScreenPreview() {
    HomeSizeBarScreen(navController = rememberNavController())
}