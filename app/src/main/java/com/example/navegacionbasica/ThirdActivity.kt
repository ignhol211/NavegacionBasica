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

        const val TAG_TEXT = "TAG_TEXT"

        fun launch(context: Context, text:String){
            val intent = Intent(context,ThirdActivity::class.java)
            intent.putExtra(TAG_TEXT,text)
            context.startActivity(intent)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tv1.text = intent.getStringExtra (TAG_TEXT)
    }
}