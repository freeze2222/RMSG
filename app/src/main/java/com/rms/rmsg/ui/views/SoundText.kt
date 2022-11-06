package com.rms.rmsg.ui.views

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rms.rmsg.ui.model.data.boldFont

@Composable
fun SoundText(
    text: String = "",
    size: TextUnit = 32.sp,
    fontFamily: FontFamily = boldFont,
    color: Color = Color.White,
    padding_start:Dp = 37.dp
) {
    Text(
        text = text,
        fontSize = size,
        fontFamily = fontFamily,
        color = color,
        modifier = Modifier.padding(start = padding_start)
    )
}