package com.example.fintrack.data.local.database

import androidx.room3.Room
import androidx.room3.RoomDatabase
import com.example.fintrack.utils.constants.Constants
import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSApplicationSupportDirectory
import platform.Foundation.NSFileManager
import platform.Foundation.NSUserDomainMask

actual fun getDatabaseBuilder(): RoomDatabase.Builder<AppDatabase> =
    Room.databaseBuilder<AppDatabase>(
        name = applicationSupportDirectory() + "/${Constants.DATABASE_NAME}"
    ).setDriver(androidx.sqlite.driver.bundled.BundledSQLiteDriver())

@OptIn(ExperimentalForeignApi::class)
private fun applicationSupportDirectory(): String {
    val documentDictory = NSFileManager.defaultManager.URLForDirectory(
        directory = NSApplicationSupportDirectory,
        inDomain = NSUserDomainMask,
        appropriateForURL = null,
        create = false,
        error = null
    )
    return requireNotNull(documentDictory?.path)
}