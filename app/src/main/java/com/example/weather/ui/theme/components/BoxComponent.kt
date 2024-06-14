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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
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
            .height(220.dp)
            .background(
                brush = Brush.linearGradient(linearColorList),
                shape = RoundedCornerShape(20.dp)
            )

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(start = 30.dp, top = 30.dp, end = 30.dp)
        ) {
            Column {
                Text(text = "Chance of rain 60%", style = Typography.titleSmall)
                Text("Partly Cloudy", style = Typography.bodyLarge)
            }
            Image(
                painter = painterResource(id = R.drawable.boxcomponent),
                contentDescription = "Box Image"
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 30.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.location_white),
                contentDescription = "Icon Location",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = stringResource(id = R.string.location_1), style = Typography.titleSmall)
        }
        Spacer(modifier = Modifier.height(14.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(start = 30.dp)
        ) {
            Text(text = "73\u00B0C", style = Typography.bodyLarge)
            Spacer(modifier = Modifier.width(25.dp))
            Row(
                modifier = Modifier.fillMaxWidth(1f)
            ) {
                Icon(imageVector = ImageVector.vectorResource(id = R.drawable.weather_hail), contentDescription = "Weather Hail", tint = Color.White)
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = "20%", style = Typography.displaySmall)
                Spacer(modifier = Modifier.width(20.dp))
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.weather_sunny),
                    contentDescription = "Weather Hail",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = "0.2", style = Typography.displaySmall)
                Spacer(modifier = Modifier.width(20.dp))
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.weather_windy),
                    contentDescription = "Weather Hail",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = "10%", style = Typography.displaySmall)
            }



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