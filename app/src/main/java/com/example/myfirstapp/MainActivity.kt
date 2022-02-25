package com.example.myfirstapp

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonDalee1: Button = findViewById(R.id.ButtonDalee6)
        ButtonDalee1.setOnClickListener{
           val intent = Intent(this, MainActivity2::class.java)
           startActivity(intent)
        }
    }
}






