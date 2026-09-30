package com.example.fintrack.data.local.database

import android.content.Context
import androidx.room3.Room
import androidx.room3.RoomDatabase
import com.example.fintrack.utils.constants.Constants
import org.koin.mp.KoinPlatform.getKoin

actual fun getDatabaseBuilder(): RoomDatabase.Builder<AppDatabase> {
    val context = getKoin().get<Context>()
    val dbFile = context.getDatabasePath(Constants.DATABASE_NAME)
    return Room.databaseBuilder<AppDatabase>(
        context = context,
        name = dbFile.absoluteFile.toString(),
    )
}
