package com.example.fintrack.data.network.datasource.login

import com.example.fintrack.data.network.model.request.LoginRequest
import com.example.fintrack.data.network.model.response.login.LoginResponse
import com.example.fintrack.domain.mapper.login.toDomain
import com.example.fintrack.domain.model.login.LoginModel
import com.example.fintrack.utils.network.NetworkResult
import com.example.fintrack.utils.network.safeApiCall
import io.ktor.client.HttpClient
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import org.koin.core.annotation.Factory

@Factory
class LoginNetworkDataSourceImpl(
    private val httpClient: HttpClient,
) : LoginNetworkDataSource {

    override suspend fun login(
        url: String,
        loginRequest: LoginRequest,
    ): NetworkResult<LoginModel> =
        safeApiCall(
            apiCall = {
                httpClient.post(urlString = url) {
                    contentType(type = ContentType.Application.Json)
                    setBody(body = loginRequest)
                }
            },
            transform = { data: LoginResponse ->
                data.toDomain()
            },
        )
}
