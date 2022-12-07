package com.pixelbitperu.poketest.ui.pokemonlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pixelbitperu.poketest.databinding.ActivityPokemonListBinding

class PokemonListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPokemonListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}