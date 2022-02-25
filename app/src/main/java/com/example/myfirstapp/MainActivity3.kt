package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val ButtonDalee3: Button = findViewById(R.id.ButtonDalee3)
        ButtonDalee3.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}