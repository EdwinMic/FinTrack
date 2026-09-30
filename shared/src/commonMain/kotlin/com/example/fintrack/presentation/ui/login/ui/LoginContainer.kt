package com.example.fintrack.presentation.ui.login.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.fintrack.presentation.component.button.ButtonCustom
import com.example.fintrack.presentation.component.card.LoginCard
import com.example.fintrack.presentation.component.container.SafeScreenContainerTest
import com.example.fintrack.presentation.component.field.TextFieldCustom
import com.example.fintrack.presentation.component.field.TextFieldPassword
import com.example.fintrack.presentation.component.text.TextBigBold
import com.example.fintrack.presentation.component.text.TextSmallExtra
import com.example.fintrack.presentation.theme.AppTheme
import com.example.fintrack.presentation.theme.Dimens
import fintrack.shared.generated.resources.Res
import fintrack.shared.generated.resources.email
import fintrack.shared.generated.resources.email_example
import fintrack.shared.generated.resources.ic_email
import fintrack.shared.generated.resources.ic_password
import fintrack.shared.generated.resources.ic_visibility_off
import fintrack.shared.generated.resources.ic_visibility_on
import fintrack.shared.generated.resources.password
import fintrack.shared.generated.resources.password_example

import org.jetbrains.compose.resources.stringResource

@Composable
fun LoginContainer(
    navigateToHome: () -> Unit = {},
    navigateToRegister: () -> Unit = {},
    email: String = "",
    onEmailChange: (String) -> Unit = {},
    password: String = "",
    onPasswordChange: (String) -> Unit = {},
    passwordVisible: Boolean = false,
    onPasswordVisibleChange: (Boolean) -> Unit = {},
) {
    val scrollState = rememberScrollState()
    val focusManager = LocalFocusManager.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(Dimens.padding16)
            .verticalScroll(scrollState),
    ) {
        TextBigBold(
            modifier = Modifier.wrapContentSize(),
            color = AppTheme.colors.text.blue,
            text = "FinTrack",
        )
        TextSmallExtra(
            modifier = Modifier.wrapContentSize()
                .padding(top = Dimens.padding4),
            color = AppTheme.colors.text.black,
            text = "Tus finanzas, claras incluso sin conexión.",
        )

        Spacer(modifier = Modifier.height(Dimens.padding32))
        LoginCard(
            onClick = navigateToHome,
            title = "$--",
            subTitle = "Balance disponible",
            backgroundCard = AppTheme.colors.onPrimary
        )

        Spacer(modifier = Modifier.height(Dimens.padding64))
        TextFieldCustom(
            value = email,
            onValueChange = onEmailChange,
            labelColor = AppTheme.colors.text.black,
            label = stringResource(Res.string.email),
            placeholderColor = AppTheme.colors.text.black,
            placeholder = stringResource(Res.string.email_example),
            leadingIcon = Res.drawable.ic_email,
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next,
        )
        
        Spacer(modifier = Modifier.height(Dimens.padding24))

        TextFieldPassword(
            email = password,
            onEmailChange = onPasswordChange,
            passwordVisible = passwordVisible,
            onPasswordVisibleChange = onPasswordVisibleChange,
            labelColor = AppTheme.colors.text.black,
            label = stringResource(Res.string.password),
            placeholderColor = AppTheme.colors.text.black,
            placeholder = stringResource(Res.string.password_example),
            leadingIcon = Res.drawable.ic_password,
            trailingIconActive = Res.drawable.ic_visibility_on,
            trailingIconInActive = Res.drawable.ic_visibility_off,
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done,
            keyboardActions = KeyboardActions(
                onAny = {
                    focusManager.clearFocus()
                },
            ),
        )

        Spacer(modifier = Modifier.height(Dimens.padding64))

        ButtonCustom(
            onClick = navigateToHome,
            modifier = Modifier.fillMaxWidth(),
            backgroundButton = AppTheme.colors.primary,
            textColor = AppTheme.colors.backgrounds.white,
            text = "Continuar",
        )
        Spacer(modifier = Modifier.height(Dimens.padding24))
        ButtonCustom(
            onClick = navigateToRegister,
            modifier = Modifier.fillMaxWidth(),
            backgroundButton = AppTheme.colors.primary,
            textColor = AppTheme.colors.backgrounds.white,
            text = "Registra tu cuenta",
        )
        Spacer(modifier = Modifier.height(Dimens.padding24))
        TextSmallExtra(
            modifier = Modifier.fillMaxSize()
                .padding(top = Dimens.padding4)
                .clickable(onClick = navigateToRegister),
            color = AppTheme.colors.text.black,
            text = "Registra tu cuenta",
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

