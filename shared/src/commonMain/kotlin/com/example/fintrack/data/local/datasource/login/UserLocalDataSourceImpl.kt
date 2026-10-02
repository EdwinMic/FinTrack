package com.example.fintrack.data.local.datasource.login

import com.example.fintrack.data.local.database.user.UserDao
import com.example.fintrack.data.local.datastore.AppDataStore
import com.example.fintrack.domain.mapper.user.toEntity
import com.example.fintrack.domain.model.user.UserModel
import org.koin.core.annotation.Factory

@Factory
class UserLocalDataSourceImpl(
    private val userDao: UserDao,
    private val appDataStore: AppDataStore,
): UserLocalDataSource {

    override suspend fun insertUserAndDelete(user: UserModel) {
        userDao.insertUserAndDeleteOld(user = user.toEntity())
    }

    override suspend fun saveUserToken(token: String) {
        appDataStore.saveUserToken(token = token)
    }
}
