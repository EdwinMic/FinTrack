package com.example.fintrack.domain.model.user

data class UserTokensModel(
    val token_type: String,
    val access_token: String,
    val refresh_token: String,
    val expires_in: Int,
)
