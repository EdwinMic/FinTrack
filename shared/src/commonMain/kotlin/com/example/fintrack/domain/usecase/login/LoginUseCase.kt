package com.example.fintrack.domain.usecase.login

import com.example.fintrack.data.network.model.request.LoginRequest
import com.example.fintrack.domain.model.login.LoginModel
import com.example.fintrack.domain.repository.login.LoginRepository
import com.example.fintrack.utils.network.NetworkResult
import kotlinx.coroutines.flow.Flow
import org.koin.core.annotation.Factory

@Factory
class LoginUseCase(
    private val loginRepository: LoginRepository,
) {

    suspend fun login(
        url: String,
        email: String,
        password: String,
    ): Flow<NetworkResult<LoginModel>> =
        loginRepository.login(
            url = url,
            loginRequest = LoginRequest(
                email = email,
                password = password,
            ),
        )
}
