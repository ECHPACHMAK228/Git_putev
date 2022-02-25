package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val ButtonDalee4: Button = findViewById(R.id.ButtonDalee4)
        ButtonDalee4.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}