package com.pixelbitperu.poketest.ui.launch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.pixelbitperu.poketest.data.model.PokemonListProvider
import com.pixelbitperu.poketest.databinding.ActivityLaunchBinding


class LaunchActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLaunchBinding

    private val launchViewModel:LaunchViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLaunchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //startAudio()
    }

    private fun startAudio() {
        TODO("Not yet implemented")
    }

    override fun onResume() {
        super.onResume()

        binding.btnStart.setOnClickListener {
//            val intent = Intent(this,PokemonListActivity::class.java)
//            startActivity(intent)

            println(PokemonListProvider.pokemonListProvider.toString())


        }

    }


}