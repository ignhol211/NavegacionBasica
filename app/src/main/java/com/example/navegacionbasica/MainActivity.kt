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
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("minion",R.mipmap.minion)
            startActivity(intent)
        }

        binding.b2.setOnClickListener(){
            ThirdActivity.launch(this,binding.et1.text.toString())
        }

        binding.b3.setOnClickListener(){
            if ((Random.nextBoolean())){
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("minion",R.mipmap.minion2)
                startActivity(intent)
            }else{
                ThirdActivity.launch(this,binding.et1.text.toString().uppercase())
            }
        }

    }
}