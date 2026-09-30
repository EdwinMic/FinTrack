package com.example.fintrack.presentation.component.card

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.fintrack.presentation.component.container.SafeScreenContainerTest
import com.example.fintrack.presentation.component.text.TextNormalBold
import com.example.fintrack.presentation.theme.AppTheme
import com.example.fintrack.presentation.theme.Dimens

class CardLogin {
}

@Composable
fun SimpleCard(
    onClick: () -> Unit = {},
    modifierCard: Modifier = Modifier,
    modifierColumn: Modifier = Modifier,
    cardBackgroundColor: Color = Color.White,
    cardElevation: Dp = Dimens.elevation2,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    paddingColumn: Dp = Dimens.padding16,
    content: @Composable ColumnScope.() -> Unit = {},
) {
    Card(
        onClick = onClick,
        modifier = modifierCard.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = cardBackgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = cardElevation),
    ) {
        Column(
            modifier = modifierColumn
                .fillMaxWidth()
                .padding(all = paddingColumn),
            horizontalAlignment = horizontalAlignment,
            verticalArrangement = verticalArrangement,
            content = content,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SimpleCardPreview() {
    SafeScreenContainerTest {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = Dimens.padding16),
            verticalArrangement = Arrangement.spacedBy(Dimens.padding16),
        ) {
            SimpleCard(
                cardBackgroundColor = AppTheme.colors.backgrounds.white,
                content = {
                    TextNormalBold(
                        color = AppTheme.colors.backgrounds.black,
                        text = "Test",
                    )
                    TextNormalBold(
                        color = AppTheme.colors.backgrounds.black,
                        text = "Test",
                    )
                },
            )
        }
    }
}
