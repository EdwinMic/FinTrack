package com.example.fintrack.data.network.client

import com.example.fintrack.data.local.datastore.AppDataStore
import io.ktor.client.HttpClient

expect fun createHttpClient(appDataStore: AppDataStore): HttpClient