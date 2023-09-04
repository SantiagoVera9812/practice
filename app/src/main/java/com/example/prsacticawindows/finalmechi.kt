package com.example.prsacticawindows

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.prsacticawindows.databinding.ActivityFinalmechiBinding

class finalmechi : AppCompatActivity() {

    private lateinit var binding: ActivityFinalmechiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFinalmechiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val string = intent.getStringExtra("camponuevo")
        val string2 = intent.getStringExtra("camponuevo2")

        binding.nombreCapital.text = string
        binding.siglas.text = string2


    }

}