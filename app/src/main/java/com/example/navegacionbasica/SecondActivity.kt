package com.example.navegacionbasica

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navegacionbasica.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.foto.setImageResource(intent.getIntExtra("minion",0))
    }
}