package com.example.fintrack.presentation.component.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import com.example.fintrack.presentation.theme.AppTheme
import com.example.fintrack.presentation.theme.Dimens

@Composable
fun TextNormalBold(
    modifier: Modifier = Modifier,
    fontSize: TextUnit = Dimens.textSizeNormal,
    color: Color,
    text: String,
    textAlign: TextAlign = TextAlign.Center,
) {
    Text(
        modifier = modifier,
        text = text,
        textAlign = textAlign,
        style = AppTheme.typography.bodyNormal.copy(
            fontSize = fontSize,
            fontWeight = FontWeight.Bold,
        ),
        color = color,
    )
}

@Composable
fun TextNormalBold30(
    modifier: Modifier = Modifier,
    fontSize: TextUnit = Dimens.textSizeBig30,
    color: Color,
    text: String,
    textAlign: TextAlign = TextAlign.Center,
) {
    Text(
        modifier = modifier,
        text = text,
        textAlign = textAlign,
        style = AppTheme.typography.bodyNormal.copy(
            fontSize = fontSize,
            fontWeight = FontWeight.Bold,
        ),
        color = color,
    )
}