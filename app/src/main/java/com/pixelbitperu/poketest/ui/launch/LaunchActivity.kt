package com.pixelbitperu.poketest.ui.launch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.pixelbitperu.poketest.data.model.PokeResult
import com.pixelbitperu.poketest.data.model.PokemonListProvider
import com.pixelbitperu.poketest.databinding.ActivityLaunchBinding
import com.pixelbitperu.poketest.domain.GetPokemonList


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
            val listaPokemones:List<PokeResult> = emptyList()
            GetPokemonList().let { listaPokemones}

            try{
                for (i:PokeResult in listaPokemones){
                    var content:String=""
                    content+="name: "+i.name+"\n"
                    content+="url: "+i.url+"\n"
                    Log.i("pokemones", content.toList().toString())
//                println(content+"")
                }
            }catch (e:Exception){
                Log.i("pokeERROR", "no listó pipipi")

            }




//                println(PokemonListProvider.pokemonListProvider.toString())


        }

    }


}