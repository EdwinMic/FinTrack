package com.example.fintrack.data.network.model.response.login

import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val id: String?,
    val full_name: String?,
    val email: String?,
    val phone: Int?,
    val role: String?,
    val status: String?,
    val created_at: String?,
    val updated_at: String?,
){

}
