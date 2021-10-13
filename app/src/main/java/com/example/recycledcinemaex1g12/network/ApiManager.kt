package com.example.recycledcinemaex1g12.network

import com.example.recycledcinemaex1g12.service.UserService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiManager {
    companion object{
        val BASE_URL = "https://howtodoandroid.com/"
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

        val userService = retrofit.create(UserService::class.java)
    }
}