package com.pixelbitperu.poketest.ui.launch.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pixelbitperu.poketest.R
import com.pixelbitperu.poketest.databinding.ActivityLaunchBinding

class LaunchActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLaunchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLaunchBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_launch)

        //startAudio()
    }

    private fun startAudio() {
        TODO("Not yet implemented")
    }

    override fun onResume() {
        super.onResume()


    }
}