package com.example.navegacionbasica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navegacionbasica.databinding.ActivityMainBinding
import com.example.navegacionbasica.databinding.ActivityThirdBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.b1.setOnClickListener(){
            SecondActivity.launch(this,R.mipmap.minion)
        }

        binding.b2.setOnClickListener(){
            ThirdActivity.launch(this,"El edit text de la activity anterior tenía una longitud de "+binding.et1.text.length+" caracteres")
        }

        binding.b3.setOnClickListener(){
            if ((Random.nextBoolean())){
                SecondActivity.launch(this,R.mipmap.minion2)
            }else{
                ThirdActivity.launch(this,"El edit text de la activity anterior contenía: "+binding.et1.text.toString().uppercase())
            }
        }

    }
}