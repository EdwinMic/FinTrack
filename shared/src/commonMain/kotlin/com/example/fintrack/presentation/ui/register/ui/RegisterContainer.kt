package com.example.fintrack.presentation.ui.register.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fintrack.presentation.component.container.SafeScreenContainerTest
import com.example.fintrack.presentation.component.text.TextBigBold
import com.example.fintrack.presentation.theme.AppTheme
import com.example.fintrack.presentation.theme.Dimens


@Composable
fun RegisterContainer(
    //navigateToRegister: () -> Unit = {}
) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = Dimens.padding16)
            .verticalScroll(state = scrollState),
        verticalArrangement = Arrangement.spacedBy(
            space = Dimens.padding16,
            alignment = Alignment.CenterVertically,
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextBigBold(
            modifier = Modifier.fillMaxWidth(),
            color = AppTheme.colors.text.black,
            text = "Register",
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun PreviewRegisterContainer() {
    SafeScreenContainerTest {
        RegisterContainer()
    }
}