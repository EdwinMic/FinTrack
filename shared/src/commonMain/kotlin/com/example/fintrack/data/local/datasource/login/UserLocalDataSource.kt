package com.example.fintrack.data.local.datasource.login

import com.example.fintrack.domain.model.user.UserModel

interface UserLocalDataSource {
    suspend fun insertUserAndDelete(user: UserModel)
    suspend fun saveUserToken(token: String)
}
