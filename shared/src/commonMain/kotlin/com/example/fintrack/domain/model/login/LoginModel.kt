package com.example.fintrack.domain.model.login

data class LoginModel(
    val success: Boolean,
    val message: String,
    val data: LoginDataModel?,
)
