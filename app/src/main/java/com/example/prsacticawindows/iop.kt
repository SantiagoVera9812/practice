package com.example.prsacticawindows

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prsacticawindows.databinding.ActivityIopBinding

class iop : AppCompatActivity() {

    private lateinit var binding: ActivityIopBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIopBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}