package com.example.weather.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.weather.R
import com.example.weather.ui.theme.Typography

@Composable
fun LocationTextButton(location: String,onClickLocation: () -> Unit) {
    
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(imageVector = ImageVector.vectorResource(id = R.drawable.location), contentDescription = "Location", modifier = Modifier.scale(1.3f))
        TextButton(onClick = onClickLocation) {
        Text(location, style = Typography.labelSmall)
        }
    }
}


@Preview
@Composable
fun LocationPreview() {
    LocationTextButton("New York", onClickLocation = {})
}
