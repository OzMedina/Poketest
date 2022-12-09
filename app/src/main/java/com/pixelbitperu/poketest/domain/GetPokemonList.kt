package com.pixelbitperu.poketest.domain

import com.pixelbitperu.poketest.data.PokemonRepository
import com.pixelbitperu.poketest.data.model.PokeResult
import com.pixelbitperu.poketest.data.model.PokemonListModel

class GetPokemonList {

    private val repository = PokemonRepository()

//    suspend operator fun invoke():List<PokemonListModel>? {
//        return repository.getPokemonListRepository()
//    }

    suspend operator fun invoke():List<PokeResult>? {
        return repository.getPokemonListRepository() }
}