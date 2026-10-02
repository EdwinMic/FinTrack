package com.example.fintrack.domain.usecase.user

import com.example.fintrack.domain.model.user.UserTokensModel
import com.example.fintrack.domain.repository.user.UserRepository
import kotlinx.coroutines.flow.Flow
import org.koin.core.annotation.Factory

@Factory
class SaveUserTokenUseCase(
    private val userRepository: UserRepository,
) {
    suspend operator fun invoke(token: UserTokensModel?): Flow<Unit> =
        if (!token?.access_token.isNullOrEmpty()) {
            userRepository.saveUserToken(token = token.access_token)
        } else {
            throw IllegalArgumentException()
        }
}
