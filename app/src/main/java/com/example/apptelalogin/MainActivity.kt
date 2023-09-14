package com.example.apptelalogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apptelalogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btEntrar.setOnClickListener{
            val navegarHome = Intent(this, Home:: class.java)
            startActivity(navegarHome)
        }

        binding.txtTelaCadastro.setOnClickListener{
            val cadastro = Intent(this, TelaCadastro::class.java)
            startActivity(cadastro)
        }

    }

}


