package com.example.fintrack.data.local.database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.fintrack.data.local.database.user.UserDao
import com.example.fintrack.data.local.model.user.UserEntity
@Database(
    entities = [
        //PackagesEntity::class,
        UserEntity::class,
    ],
    version = 1,
    exportSchema = false,
)
@ConstructedBy(AppDatabaseConstructor::class)
abstract class AppDatabase: RoomDatabase() {

    //abstract fun packagesDao(): PackagesDao
    abstract fun userDao(): UserDao
}

expect fun getDatabaseBuilder(): RoomDatabase.Builder<AppDatabase>
