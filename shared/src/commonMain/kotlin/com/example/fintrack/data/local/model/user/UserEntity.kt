package com.example.fintrack.data.local.model.user

import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(tableName = "tbl_user")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String?,
    val email: String?,
    val phone: String?,
    val role: String?,
)