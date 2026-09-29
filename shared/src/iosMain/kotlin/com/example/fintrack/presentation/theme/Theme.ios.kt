package com.example.fintrack.presentation.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import platform.UIKit.UIApplication
import platform.UIKit.UIStatusBarStyleDarkContent
import platform.UIKit.UIStatusBarStyleLightContent
import platform.UIKit.setStatusBarStyle

@Composable
internal actual fun SystemAppearance(isDarkMode: Boolean) {
    LaunchedEffect(key1 = isDarkMode) {
        UIApplication.sharedApplication.setStatusBarStyle(
            if (isDarkMode) UIStatusBarStyleDarkContent else UIStatusBarStyleLightContent
        )
    }
}