package com.example.fintrack.domain.usecase.user

import com.example.fintrack.domain.model.user.UserModel
import com.example.fintrack.domain.repository.user.UserRepository
import kotlinx.coroutines.flow.Flow
import org.koin.core.annotation.Factory

@Factory
class InsertUserAndDeleteUseCase(
    private val userRepository: UserRepository,
) {
    suspend operator fun invoke(user: UserModel?): Flow<Unit> =
        user?.let {
            userRepository.insertUserAndDelete(user = user)
        } ?: run {
            throw IllegalArgumentException()
        }
}
