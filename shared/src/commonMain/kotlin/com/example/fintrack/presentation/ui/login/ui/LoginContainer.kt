package com.example.fintrack.presentation.ui.login.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.fintrack.presentation.component.button.ButtonCustom
import com.example.fintrack.presentation.component.card.LoginCard
import com.example.fintrack.presentation.component.card.SimpleCard
import com.example.fintrack.presentation.component.container.SafeScreenContainerTest
import com.example.fintrack.presentation.component.field.TextFieldCustom
import com.example.fintrack.presentation.component.field.TextFieldPassword
import com.example.fintrack.presentation.component.text.TextBigBold
import com.example.fintrack.presentation.component.text.TextNormal
import com.example.fintrack.presentation.component.text.TextNormalBold
import com.example.fintrack.presentation.component.text.TextSmallExtra
import com.example.fintrack.presentation.theme.AppTheme
import com.example.fintrack.presentation.theme.Dimens
//import course.shared.generated.resources.hello
import fintrack.shared.generated.resources.Res
import fintrack.shared.generated.resources.email
import fintrack.shared.generated.resources.email_example
import fintrack.shared.generated.resources.ic_email
import fintrack.shared.generated.resources.ic_password
import fintrack.shared.generated.resources.ic_visibility_off
import fintrack.shared.generated.resources.ic_visibility_on
import fintrack.shared.generated.resources.login
import fintrack.shared.generated.resources.password
import fintrack.shared.generated.resources.password_example

import org.jetbrains.compose.resources.stringResource

@Composable
fun LoginContainer(
    navigateToHome: () -> Unit = {},
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
        TextNormal(
            modifier = Modifier.fillMaxWidth()
                .padding(top = Dimens.padding4),
            color = AppTheme.colors.text.black,
            text = "Registra tu cuenta.",
        )
    }
}

/*@Composable
fun LoginContainer(
    navigateToHome: () -> Unit = {},
    email: String = "",
    onEmailChange: (String) -> Unit = {},
    password: String = "",
    onPasswordChange: (String) -> Unit = {},
    passwordVisible: Boolean = false,
    onPasswordVisibleChange: (Boolean) -> Unit = {},
    onLoginClick: () -> Unit = {},
) {
    val scrollState = rememberScrollState()
    val focusManager = LocalFocusManager.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = Dimens.padding16)
            .verticalScroll(state = scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.fillMaxWidth().weight(1f))
        TextBigBold(
            modifier = Modifier.fillMaxWidth(),
            color = AppTheme.colors.backgrounds.black,
            text = stringResource(Res.string.login),
        )
        Spacer(modifier = Modifier.fillMaxWidth().weight(1f))
        SimpleCard(
            modifierCard = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(
                space = Dimens.padding16,
                alignment = Alignment.CenterVertically,
            ),
            content = {
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
                Spacer(modifier = Modifier.height(height = Dimens.height16))
                ButtonCustom(
                    onClick = onLoginClick,
                    backgroundButton = AppTheme.colors.primary,
                    textColor = AppTheme.colors.backgrounds.white,
                    text = stringResource(Res.string.login),
                )
                Spacer(modifier = Modifier.height(height = Dimens.height8))
            },
        )
        Spacer(modifier = Modifier.fillMaxWidth().weight(2f))
    }
}*/
@Preview(showBackground = true)
@Composable
private fun LoginContainerPreview() {
    SafeScreenContainerTest {
        LoginContainer()
    }
}

