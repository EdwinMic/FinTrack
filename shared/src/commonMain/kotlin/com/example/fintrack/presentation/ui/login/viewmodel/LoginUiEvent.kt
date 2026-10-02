package com.example.fintrack.presentation.ui.login.viewmodel

sealed class LoginUiEvent {
    internal data object Idle: LoginUiEvent()
    data object LoginSuccess: LoginUiEvent()
}
