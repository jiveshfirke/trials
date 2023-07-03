package com.dedsec.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutt: Button = findViewById(R.id.roll_button)

        rollbutt.text = "Let's roll"

        rollbutt.setOnClickListener{
            rollDice()
        }
    }
    fun rollDice(){
        val randomint = Random.nextInt(6) + 1
        val textview = findViewById<TextView>(R.id.txt)
        textview.text = randomint.toString()
    }
}