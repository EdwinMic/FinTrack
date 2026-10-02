package com.example.fintrack.data.network.model.response.login

import kotlinx.serialization.Serializable

@Serializable
data class UserTokensResponse(
    val token_type: String?,
    val access_token: String?,
    val refresh_token: String?,
    val expires_in: Int?,
) {

}
