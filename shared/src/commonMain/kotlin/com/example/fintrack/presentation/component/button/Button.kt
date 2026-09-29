package com.example.fintrack.presentation.component.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import com.example.fintrack.presentation.component.text.TextNormalBold
import com.example.fintrack.presentation.theme.Dimens

@Composable
fun ButtonCustom(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    backgroundButton: Color = Color.Black,
    height: Dp = Dimens.height40,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(size = Dimens.corner20),
    textColor: Color = Color.White,
    text: String = "",
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(height = height),
        colors = ButtonDefaults.buttonColors(contentColor = backgroundButton),
        enabled = enabled,
        shape = shape,
    ) {
        TextNormalBold(
            modifier = Modifier.fillMaxWidth(),
            color = textColor,
            text = text,
        )
    }
}
