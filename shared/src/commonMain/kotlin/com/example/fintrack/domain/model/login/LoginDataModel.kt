package com.example.fintrack.domain.model.login

import com.example.fintrack.domain.model.user.UserModel
import com.example.fintrack.domain.model.user.UserTokensModel

data class LoginDataModel(
    val user: UserModel?,
    val tokens: UserTokensModel?,
)
