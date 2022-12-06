package com.pixelbitperu.poketest.data.api

import com.pixelbitperu.poketest.data.model.PokemonListModel
import retrofit2.Call
import retrofit2.http.GET

interface PokemonApiClient {

    @GET("pokemon/")
    fun getPokemonList():Call<List<PokemonListModel>>
}