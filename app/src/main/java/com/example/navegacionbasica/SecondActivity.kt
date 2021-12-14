package com.example.navegacionbasica

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navegacionbasica.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondBinding

    companion object{

        const val TAG_TEXT = "TAG_TEXT"

        fun launch(context: Context, image:Int){
            val intent = Intent(context,SecondActivity::class.java)
            intent.putExtra(TAG_TEXT,image)
            context.startActivity(intent)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.foto.setImageResource(intent.getIntExtra(TAG_TEXT,0))
    }
}