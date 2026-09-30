package com.example.fintrack.di

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module
import com.example.fintrack.data.local.database.AppDatabase
import com.example.fintrack.data.local.database.getDatabaseBuilder

val dispatcherModule = module {
    single<CoroutineDispatcher> { Dispatchers.IO }
}

val databaseModule = module {
    single<AppDatabase> {
        getDatabaseBuilder()
            .setQueryCoroutineContext(Dispatchers.IO)
            .build()
    }
}

val dataStoreModule = module {
    /*single<DataStore<Preferences>> { createDataStore() }
    singleOf(constructor = ::AppDataStore)*/
}

val databaseDaoModule = module {

}

val networkModule = module {
    //single { createHttpClient(appDataStore = get()) }
}

val dataSourceRemoteModule = module {

}

val dataSourceLocalModule = module {

}

val repositoryModule = module {

}

val useCaseModule = module {

}

val viewmodelModule = module {

}

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(
            dispatcherModule,
            databaseModule,
            dataStoreModule,
            databaseDaoModule,
            networkModule,
            dataSourceRemoteModule,
            dataSourceLocalModule,
            repositoryModule,
            useCaseModule,
            viewmodelModule,
        )
    }
}
