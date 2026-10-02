package com.example.fintrack.domain.repository.login

import com.example.fintrack.data.network.model.request.LoginRequest
import com.example.fintrack.domain.model.login.LoginModel
import com.example.fintrack.utils.network.NetworkResult
import kotlinx.coroutines.flow.Flow

interface LoginRepository {
    suspend fun login(
        url: String,
        loginRequest: LoginRequest,
    ): Flow<NetworkResult<LoginModel>>
}
