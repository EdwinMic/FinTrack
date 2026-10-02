package com.example.fintrack.data.network.model.response.login

import com.example.fintrack.data.network.model.response.base.BaseResponse
import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse (
    val data: LoginDataResponse?,
) : BaseResponse() {

}
