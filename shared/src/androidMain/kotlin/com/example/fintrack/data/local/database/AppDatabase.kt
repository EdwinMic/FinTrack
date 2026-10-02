package com.example.fintrack.data.local.database


import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.fintrack.utils.constants.Constants
import org.koin.mp.KoinPlatform.getKoin

actual fun getDatabaseBuilder(): RoomDatabase.Builder<AppDatabase> {
    val context = getKoin().get<Context>()
    val dbFile = context.getDatabasePath(Constants.DATABASE_NAME)
    return Room.databaseBuilder<AppDatabase>(
        context = context,
        name = dbFile.absolutePath,
    )
}