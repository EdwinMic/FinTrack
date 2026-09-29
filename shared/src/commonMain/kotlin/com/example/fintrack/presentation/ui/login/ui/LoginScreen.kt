package com.example.fintrack.presentation.ui.login.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.fintrack.presentation.component.container.SafeScreenContainer
import com.example.fintrack.presentation.component.container.SafeScreenContainerTest
import org.koin.mp.KoinPlatformTools

@Composable
fun LoginScreen(
    navigateToHome: () -> Unit = {},
    ) {
    SafeScreenContainer {
        LoginContainer(
            navigateToHome = navigateToHome,
        )
    }
}
@Preview(showBackground = true)
@Composable
private fun LoginPreviewScreen() {
    SafeScreenContainerTest {
        LoginScreen()
    }
}