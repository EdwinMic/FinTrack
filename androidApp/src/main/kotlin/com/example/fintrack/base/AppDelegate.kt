package com.example.fintrack.base

import android.app.Application
import com.example.fintrack.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class AppDelegate: Application() {
    override fun onCreate() {
        super.onCreate()
        // DI KMP
        initKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@AppDelegate)
        }
    }
}