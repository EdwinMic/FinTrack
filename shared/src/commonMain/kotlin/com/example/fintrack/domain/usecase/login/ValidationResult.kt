package com.example.fintrack.domain.usecase.login

sealed class LoginValidationResult {
    data object EmailEmpty : LoginValidationResult()
    data object PasswordEmpty : LoginValidationResult()
    data object Success : LoginValidationResult()
}
