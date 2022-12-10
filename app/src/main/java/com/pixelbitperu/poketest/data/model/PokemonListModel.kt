package com.pixelbitperu.poketest.data.model

data class PokemonListModel (
    val results: List<PokeResult>
    )

data class PokeResult (
    val name:String,
    val url:String,
        )


