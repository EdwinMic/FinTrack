package com.example.fintrack.presentation.ui.register.navigation

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.fintrack.presentation.ui.register.ui.RegisterScreen

data object RegisterNavigation: Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        RegisterScreen(
            //navigator.push(RegisterNavigation)
        )

    }
}