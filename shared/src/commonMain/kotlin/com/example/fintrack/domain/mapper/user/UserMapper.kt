package com.example.fintrack.domain.mapper.user

import com.example.fintrack.data.local.model.user.UserEntity
import com.example.fintrack.domain.model.user.UserModel


fun UserEntity.toDomain(): UserModel =
    UserModel(
        id = id.toString(),
        full_name = name.orEmpty(),
        email = email.orEmpty(),
        phone = phone.orEmpty(),
        role = role.orEmpty(),
    )

fun UserModel.toEntity(): UserEntity =
    UserEntity(
        name = full_name,
        email = email,
        phone = phone,
        role = role,
    )
