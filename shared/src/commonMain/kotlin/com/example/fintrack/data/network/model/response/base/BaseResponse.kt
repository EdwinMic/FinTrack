package com.example.fintrack.data.network.model.response.base

import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer

@Serializable
open class BaseResponse(
    val success: Boolean? = false,
    val message: String? = "",
) {

}