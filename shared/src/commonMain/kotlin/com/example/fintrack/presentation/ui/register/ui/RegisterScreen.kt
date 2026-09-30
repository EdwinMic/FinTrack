package com.example.fintrack.presentation.ui.register.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.fintrack.presentation.component.container.SafeScreenContainer
import com.example.fintrack.presentation.component.container.SafeScreenContainerTest

@Composable
fun RegisterScreen(
    //navigateToRegister: () -> Unit = {}
) {
    SafeScreenContainer {
        RegisterContainer(
            //navigateToRegister = navigateToRegister,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRegisterContainer(){
    SafeScreenContainerTest {
        RegisterContainer()
    }
}
