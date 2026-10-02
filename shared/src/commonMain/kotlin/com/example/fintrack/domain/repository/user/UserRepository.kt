package com.example.fintrack.domain.repository.user

import com.example.fintrack.domain.model.user.UserModel
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun insertUserAndDelete(user: UserModel): Flow<Unit>
    suspend fun saveUserToken(token: String): Flow<Unit>
}
