package com.pixelbitperu.poketest.data.network

import com.pixelbitperu.poketest.data.model.PokeResult
import com.pixelbitperu.poketest.data.model.PokemonListModel
import com.pixelbitperu.poketest.utils.RetrofitInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PokemonService {

    private val retrofitInstance = RetrofitInstance.getRetrofitInstance()

    //Haciendo la llamada al API con corrutinas
//    suspend fun getPokemonListService():List<PokemonListModel>{
        suspend fun getPokemonListService():List<PokeResult>{
        //withContext(Dispatchers.IO) separamos del hilo pincipal(que es el de la vista)
        //y retornamos la data la data dentro de ese método
        return withContext(Dispatchers.IO){
            val responsePokemonList = retrofitInstance.create(PokemonApiClient::class.java).getPokemonList(0,151)
            responsePokemonList.body()?.results?: emptyList()
        }

    }

}