package com.example.fintrack.data.network.model.response.login

import kotlinx.serialization.Serializable

@Serializable
data class LoginDataResponse(
    val user: UserResponse?,
    val tokens: UserTokensResponse?,
) {

}
