package com.rock.paper.scissors.sgd.ikl

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    companion object{
        lateinit var choise2:String

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val player1Rock = findViewById<ImageButton>(R.id.rock_img)
        val player1Scissors = findViewById<ImageButton>(R.id.scissors_img)
        val player1Paper = findViewById<ImageButton>(R.id.paper_img)

        player1Rock.setOnClickListener {
            choise2 = "Rock"
            val toFinal = Intent(this, finRound::class.java)
            startActivity(toFinal)
        }
        player1Scissors.setOnClickListener {
            choise2 = "Scissors"
            val toFinal = Intent(this, finRound::class.java)
            startActivity(toFinal)
        }
        player1Paper.setOnClickListener {
            choise2 = "Paper"
            val toFinal = Intent(this, finRound::class.java)
            startActivity(toFinal)
        }
    }
}