package com.rock.paper.scissors.sgd.ikl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    companion object{
        lateinit var choise1:String

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val player1Rock = findViewById<ImageButton>(R.id.rock_img)
        val player1Scissors = findViewById<ImageButton>(R.id.scissors_img)
        val player1Paper = findViewById<ImageButton>(R.id.paper_img)

        player1Rock.setOnClickListener {
            choise1 = "Rock"
            val toPlayer2 = Intent(this, MainActivity2::class.java)
            startActivity(toPlayer2)
        }
        player1Scissors.setOnClickListener {
            choise1 = "Scissors"
            val toPlayer2 = Intent(this, MainActivity2::class.java)
            startActivity(toPlayer2)
        }
        player1Paper.setOnClickListener {
            choise1 = "Paper"
            val toPlayer2 = Intent(this, MainActivity2::class.java)
            startActivity(toPlayer2)
        }
    }
}