package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Options : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        val exit_game = findViewById<Button>(R.id.btn_exit)
        exit_game.setOnClickListener {
            val switch = Intent (this, MainMenu::class.java)
            startActivity(switch)
        }



    }
}