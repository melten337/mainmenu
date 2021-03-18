package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val continue_game = findViewById<Button>(R.id.btn_continue)
        continue_game.setOnClickListener {
            val switch = Intent (this, Continue::class.java)
            startActivity(switch)
        }

        val New_game = findViewById<Button>(R.id.btn_new_game)
        New_game.setOnClickListener {
            val switch = Intent (this,NewGame::class.java)
            startActivity(switch)
        }

        val Loading = findViewById<Button>(R.id.btn_load_game)
        Loading.setOnClickListener {
            val switch = Intent (this, Loading::class.java)
            startActivity(switch)
        }

        val options = findViewById<Button>(R.id.btn_options)
        options.setOnClickListener {
            val switch = Intent (this, Options::class.java)
            startActivity(switch)
        }

    }
}