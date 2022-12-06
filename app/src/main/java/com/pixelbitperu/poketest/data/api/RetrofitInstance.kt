package com.pixelbitperu.poketest.data.api

import com.pixelbitperu.poketest.R.string
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object {

        val BASE_URL = string.url_api_base_data.toString()

        fun getRetrofitInstance(): Retrofit {
            return Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}

