package com.pixelbitperu.poketest.data.network

import com.pixelbitperu.poketest.data.model.PokemonListModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonApiClient {

    //Tipo de servicio que se solicitará
    @GET("pokemon/")
    //suspend para hacer uso de las corrutinas separar el método en un hilo principal
    //Response ya que usamos corutinas, de lo contrario sería Call
    suspend fun getPokemonList(
        @Query("offset") offset:Int,
        @Query("limit") limit:Int
//    ):Response<List<PokemonListModel>>
    ):Response<PokemonListModel>
}