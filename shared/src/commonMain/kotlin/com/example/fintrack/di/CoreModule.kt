package com.example.fintrack.di

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module
import com.example.fintrack.data.local.database.AppDatabase
import com.example.fintrack.data.local.database.getDatabaseBuilder
import com.example.fintrack.data.local.database.user.UserDao
import com.example.fintrack.data.local.datasource.login.UserLocalDataSource
import com.example.fintrack.data.local.datasource.login.UserLocalDataSourceImpl
import com.example.fintrack.data.local.datastore.AppDataStore
import com.example.fintrack.data.local.datastore.createDataStore
import com.example.fintrack.data.network.client.createHttpClient
import com.example.fintrack.data.network.datasource.login.LoginNetworkDataSource
import com.example.fintrack.data.network.datasource.login.LoginNetworkDataSourceImpl
import com.example.fintrack.data.repository.login.LoginRepositoryImpl
import com.example.fintrack.data.repository.user.UserRepositoryImpl
import com.example.fintrack.domain.repository.login.LoginRepository
import com.example.fintrack.domain.repository.user.UserRepository
import com.example.fintrack.domain.usecase.login.LoginUseCase
import com.example.fintrack.domain.usecase.login.ValidateLoginFormUseCase
import com.example.fintrack.domain.usecase.user.InsertUserAndDeleteUseCase
import com.example.fintrack.domain.usecase.user.SaveUserTokenUseCase
import com.example.fintrack.presentation.ui.login.viewmodel.LoginViewModel
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind

/*val dispatcherModule = module {
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
    single<DataStore<Preferences>> { createDataStore() }
    singleOf(constructor = ::AppDataStore)
}

val databaseDaoModule = module {
    //single<PackagesDao> { get<AppDatabase>().packagesDao() }
    single<UserDao> { get<AppDatabase>().userDao() }
}

val networkModule = module {
    single { createHttpClient(appDataStore = get()) }
}

val dataSourceRemoteModule = module {
    //singleOf(constructor = ::PackagesNetworkDataSourceImpl) bind PackagesNetworkDataSource::class
    singleOf(constructor = ::LoginNetworkDataSourceImpl) bind LoginNetworkDataSource::class
}

val dataSourceLocalModule = module {
    //singleOf(constructor = ::PackagesLocalDataSourceImpl) bind PackagesLocalDataSource::class
    singleOf(constructor = ::UserLocalDataSourceImpl) bind UserLocalDataSource::class
}

val repositoryModule = module {
    //singleOf(constructor = ::PackagesRepositoryImpl) bind PackagesRepository::class
    singleOf(constructor = ::UserRepositoryImpl) bind UserRepository::class
    singleOf(constructor = ::LoginRepositoryImpl) bind LoginRepository::class
}

val useCaseModule = module {
    /*factoryOf(constructor = ::GetNetworkPackagesUseCase)
    factoryOf(constructor = ::ClearAndInsertPackagesUseCase)
    factoryOf(constructor = ::GetLocalPackagesUseCase)*/
    factoryOf(constructor = ::LoginUseCase)
    //factoryOf(constructor = ::ClearAndInsertPackagesUseCase)
    factoryOf(constructor = ::SaveUserTokenUseCase)
    factoryOf(constructor = ::ValidateLoginFormUseCase)
    factoryOf(constructor = ::InsertUserAndDeleteUseCase)
}

val viewmodelModule = module {
    //viewModelOf(constructor = ::PackagesViewModel)
    viewModelOf(constructor = ::LoginViewModel)
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
*/