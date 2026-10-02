package com.example.fintrack.data.repository.login

import com.example.fintrack.data.network.datasource.login.LoginNetworkDataSource
import com.example.fintrack.data.network.model.request.LoginRequest
import com.example.fintrack.domain.model.login.LoginModel
import com.example.fintrack.domain.repository.login.LoginRepository
import com.example.fintrack.utils.network.NetworkResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import org.koin.core.annotation.Factory

@Factory
class LoginRepositoryImpl(
    private val loginNetworkDataSource: LoginNetworkDataSource,
    private val dispatcher: CoroutineDispatcher,
): LoginRepository {

    override suspend fun login(
        url: String,
        loginRequest: LoginRequest,
    ): Flow<NetworkResult<LoginModel>> = flow {
        emit(
            loginNetworkDataSource.login(
                url = url,
                loginRequest = loginRequest,
            )
        )
    }.flowOn(context = dispatcher)
}
