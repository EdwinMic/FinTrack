package com.example.fintrack.presentation.ui.controller

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.example.fintrack.presentation.theme.AppTheme
import com.example.fintrack.presentation.ui.login.navigation.LoginNavigation

@Composable
fun NavigationController() {
    AppTheme {
        Navigator(screen = LoginNavigation)
    }
}