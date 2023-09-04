package com.example.prsacticawindows

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prsacticawindows.databinding.Activity4Binding

class activity4 : AppCompatActivity() {
    private lateinit var binding : Activity4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}