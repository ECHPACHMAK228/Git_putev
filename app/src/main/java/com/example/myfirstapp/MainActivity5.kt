package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val ButtonDalee5: Button = findViewById(R.id.ButtonDalee6)
        ButtonDalee5.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
    }
}