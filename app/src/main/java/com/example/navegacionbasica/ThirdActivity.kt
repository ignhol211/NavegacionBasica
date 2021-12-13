package com.example.navegacionbasica

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.navegacionbasica.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding : ActivityThirdBinding

    companion object{

        const val textoVisible = "El edit text de la activity anterior tenía una longitud de caracteres:"

        fun launch(context: Context, text:String){
            val intent = Intent(context,ThirdActivity::class.java)
            intent.putExtra("datoUsuario",text)
            context.startActivity(intent)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val initialData = intent.getStringExtra ("datoUsuario")

        if (initialData != null) {
            binding.tv1.visibility = View.VISIBLE
            binding.tv1.text = textoVisible + initialData.length
        }else{
            binding.tv1.visibility = View.VISIBLE
            binding.tv1.text = "No introdujiste texto"
        }
    }
}