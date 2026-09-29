package com.example.fintrack.presentation.ui.login.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fintrack.presentation.component.button.ButtonCustom
import com.example.fintrack.presentation.component.container.SafeScreenContainerTest
import com.example.fintrack.presentation.component.text.TextNormalBold
import com.example.fintrack.presentation.component.text.TextNormalBold30
import com.example.fintrack.presentation.theme.AppTheme
import com.example.fintrack.presentation.theme.Dimens
//import course.shared.generated.resources.hello
import fintrack.shared.generated.resources.Res

import org.jetbrains.compose.resources.stringResource

@Composable
fun LoginContainer(
    navigateToHome: () -> Unit = {},
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(Dimens.padding16)
            .verticalScroll(scrollState),
    ) {
        TextNormalBold30(
            modifier = Modifier.wrapContentSize(),
            color = AppTheme.colors.text.blue,
            text = "FinTrack",
        )
        TextNormalBold(
            modifier = Modifier.wrapContentSize(),
            color = AppTheme.colors.text.black,
            text = "Tus finanzas, claras incluso sin conexión.",
        )
        Spacer(modifier = Modifier.height(Dimens.height16))
        ButtonCustom(
            onClick = navigateToHome,
            modifier = Modifier.fillMaxWidth(),
            backgroundButton = AppTheme.colors.primary,
            textColor = AppTheme.colors.backgrounds.white,
            text = "Continuar",
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun LoginContainerPreview() {
    SafeScreenContainerTest {
        LoginContainer()
    }
}

