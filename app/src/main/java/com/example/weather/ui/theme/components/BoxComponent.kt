package com.example.weather.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weather.R
import com.example.weather.ui.theme.Typography
import com.example.weather.ui.theme.linearColorList

@Composable
fun BoxBasic() {
    Column(
        modifier = Modifier
            .width(325.dp)
            .height(200.dp)
            .background(
                brush = Brush.linearGradient(linearColorList),
                shape = RoundedCornerShape(20.dp)
            )

    ) {
        Row(modifier = Modifier
            .fillMaxWidth(1f)
            .padding(30.dp)) {
            Column {
                Text(text = "Chance of rain 60%", style = Typography.titleSmall)
                Text("Partly Cloudy", style = Typography.bodyLarge)
            }
            Image(painter = painterResource(id = R.drawable.boxcomponent), contentDescription = "Box Image")
        }
        Spacer(modifier = Modifier.height(25.dp))
        Column {

        }
    }
}

@Composable
@Preview
fun BoxBasicPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color(0xFFFFFFFF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        BoxBasic()
    }
}