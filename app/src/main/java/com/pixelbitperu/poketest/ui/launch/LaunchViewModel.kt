package com.pixelbitperu.poketest.ui.launch

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pixelbitperu.poketest.data.model.PokeResult
import com.pixelbitperu.poketest.data.model.PokemonListProvider

class LaunchViewModel : ViewModel(){

    val launchModel = MutableLiveData<PokeResult>()

//    fun getPokemonList(){
//        val pokemonList = PokemonListProvider.pokemonListProvider
//        launchModel.postValue(pokemonList)
//    }

}