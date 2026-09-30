package com.example.fintrack.presentation.ui.home.navigation

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.fintrack.presentation.ui.home.ui.HomeScreen
import com.example.fintrack.presentation.ui.login.ui.LoginScreen

data object HomeNavigation : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        HomeScreen(
            /*navigateToHome = {
                navigator.push(item = LoginNavigation)
            }*/
        )
    }
}