package com.pixelbitperu.poketest.data

import android.util.Log
import com.pixelbitperu.poketest.data.model.PokeResult
import com.pixelbitperu.poketest.data.model.PokemonListModel
import com.pixelbitperu.poketest.data.model.PokemonListProvider
import com.pixelbitperu.poketest.data.network.PokemonService

class PokemonRepository {

    private val service = PokemonService()

//    suspend fun getPokemonListRepository():List<PokemonListModel>{
//        val response:List<PokemonListModel> = service.getPokemonListService()
//        PokemonListProvider.pokemonListProvider = response
//        return response
//    }

    suspend fun getPokemonListRepository():List<PokeResult>{
        val response = service.getPokemonListService()
        PokemonListProvider.pokemonListProvider = response
        return response

    }

}