package com.example.fintrack.presentation.component.card

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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.fintrack.presentation.component.container.SafeScreenContainerTest
import com.example.fintrack.presentation.component.text.TextBigBold
import com.example.fintrack.presentation.component.text.TextNormalBold
import com.example.fintrack.presentation.theme.AppTheme
import com.example.fintrack.presentation.theme.Dimens


@Composable
fun LoginCard(
    onClick: () -> Unit = {},
    modifierCard: Modifier = Modifier,
    modifierColum: Modifier = Modifier,
    title: String = "",
    subTitle: String = "",
    backgroundCard: Color,
) {
    SimpleCard(
        modifierCard = Modifier.fillMaxWidth(),
        cardBackgroundColor = backgroundCard,
        verticalArrangement = Arrangement.spacedBy(
            space = Dimens.padding16,
            alignment = Alignment.CenterVertically,
        ),
        content = {
            TextBigBold(
                modifier = Modifier.padding(start = Dimens.padding32, top = Dimens.padding16),
                color = AppTheme.colors.backgrounds.white,
                text = title,
            )
            TextNormalBold(
                modifier = Modifier.padding(start = Dimens.padding32),
                color = AppTheme.colors.backgrounds.white,
                text = subTitle,
            )
            Spacer(modifier = Modifier.height(height = Dimens.height8))
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun LoginCardPreview() {
    SafeScreenContainerTest {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = Dimens.padding16),
            verticalArrangement = Arrangement.spacedBy(space = Dimens.padding16),
        ) {
            LoginCard(
                title = "Internet Full",
                subTitle = "Paquete Ilimitado",
                backgroundCard = AppTheme.colors.onPrimary
            )
        }
    }
}
