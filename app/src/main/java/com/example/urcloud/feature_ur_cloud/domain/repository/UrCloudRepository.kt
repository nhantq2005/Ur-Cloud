package com.example.urcloud.feature_ur_cloud.domain.repository

import kotlinx.coroutines.flow.Flow

interface UrCloudRepository {
    suspend fun uploadFile(path:String)
    suspend fun downloadFile(path:String)
    suspend fun getFiles(path:String):Flow<List<String>>
    suspend fun deleteFile(path:String)
    suspend fun shareByUrl(path:String):Flow<String>
    suspend fun createUser(uid:String)

}