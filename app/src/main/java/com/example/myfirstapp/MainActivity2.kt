package com.example.myfirstapp

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ButtonDalee2: Button = findViewById(R.id.ButtonDalee2)
        ButtonDalee2.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}