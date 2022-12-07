package com.pixelbitperu.poketest.ui.launch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pixelbitperu.poketest.R
import com.pixelbitperu.poketest.databinding.ActivityLaunchBinding
import com.pixelbitperu.poketest.ui.pokemonlist.PokemonListActivity

class LaunchActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLaunchBinding

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
            val intent = Intent(this,PokemonListActivity::class.java)
            startActivity(intent)
        }

    }
}