package com.example.fintrack.data.repository.user

import com.example.fintrack.data.local.datasource.login.UserLocalDataSource
import com.example.fintrack.domain.model.user.UserModel
import com.example.fintrack.domain.repository.user.UserRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import org.koin.core.annotation.Factory

@Factory
class UserRepositoryImpl(
    private val userLocalDataSource: UserLocalDataSource,
    private val ioDispatcher: CoroutineDispatcher,
): UserRepository {

    override suspend fun insertUserAndDelete(user: UserModel): Flow<Unit> = flow {
        emit(userLocalDataSource.insertUserAndDelete(user = user))
    }.flowOn(context = ioDispatcher)

    override suspend fun saveUserToken(token: String): Flow<Unit> = flow {
        emit(userLocalDataSource.saveUserToken(token = token))
    }.flowOn(context = ioDispatcher)
}
