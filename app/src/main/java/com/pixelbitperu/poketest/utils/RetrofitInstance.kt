package com.pixelbitperu.poketest.utils

import com.pixelbitperu.poketest.R.string
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object {

//        val BASE_URL = string.url_api_base_data.toString()
        val BASE_URL = "https://pokeapi.co/api/v2/"

        fun getRetrofitInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}

