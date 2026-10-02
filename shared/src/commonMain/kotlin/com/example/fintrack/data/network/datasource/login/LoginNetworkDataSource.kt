package com.example.fintrack.data.network.datasource.login

import com.example.fintrack.data.network.model.request.LoginRequest
import com.example.fintrack.domain.model.login.LoginModel
import com.example.fintrack.utils.network.NetworkResult

interface LoginNetworkDataSource {
    suspend fun login(
        url: String,
        loginRequest: LoginRequest,
    ): NetworkResult<LoginModel>
}
