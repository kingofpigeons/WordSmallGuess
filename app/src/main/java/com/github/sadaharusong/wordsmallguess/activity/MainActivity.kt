package com.github.sadaharusong.wordsmallguess.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.github.sadaharusong.wordsmallguess.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startGame = findViewById<TextView>(R.id.start_game)
        startGame.setOnClickListener {
            startActivity(intent.setClass(MainActivity@this, SelectActivity::class.java))
        }
    }
}
