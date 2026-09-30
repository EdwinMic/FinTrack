package com.example.fintrack.presentation.ui.login.navigation

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.fintrack.presentation.ui.home.navigation.HomeNavigation
import com.example.fintrack.presentation.ui.login.ui.LoginScreen
import com.example.fintrack.presentation.ui.register.navigation.RegisterNavigation

data object LoginNavigation : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        LoginScreen(
            navigateToHome = {
                navigator.push(item = HomeNavigation)
            },
            navigateToRegister = {
                navigator.push(item = RegisterNavigation)
            }
        )
    }
}