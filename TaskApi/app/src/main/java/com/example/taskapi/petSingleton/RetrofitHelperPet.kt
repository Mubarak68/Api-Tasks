package com.example.taskapi.petSingleton

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelperPet {
    fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://coded-pets-api-crud.eapi.joincoded.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}