//package com.example.urcloud.di
//
//import com.example.urcloud.feature_ur_cloud.data.model.api.UrCloudApi
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import okhttp3.OkHttpClient
//import okhttp3.logging.HttpLoggingInterceptor
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import javax.inject.Singleton
//import retrofit2.create
//
//@Module
//@InstallIn(SingletonComponent::class)
//object AppModule {
//
//    private val interceptor: HttpLoggingInterceptor =
//        HttpLoggingInterceptor().apply {
//            level = HttpLoggingInterceptor.Level.BODY
//        }
//
//    private val client: OkHttpClient = OkHttpClient.Builder()
//        .addInterceptor(interceptor)
//        .build()
//
//    @Provides
//    @Singleton
//    fun providesUrCloudsApi() : UrCloudApi {
//        return Retrofit.Builder()
//            .addConverterFactory(GsonConverterFactory.create())
//            .baseUrl(UrCloudApi.BASE_URL)
//            .client(client)
//            .build()
//            .create()
//    }
//}