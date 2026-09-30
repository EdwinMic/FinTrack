package com.example.fintrack.presentation.ui.home.ui

import androidx.compose.runtime.Composable
import com.example.fintrack.presentation.component.container.SafeScreenContainer

@Composable
fun HomeScreen(
    //navigateToHome: () -> Unit = {}
) {
    SafeScreenContainer {
        HomeContainer(
            //navigateToHome = navigateToHome,
        )
    }
}