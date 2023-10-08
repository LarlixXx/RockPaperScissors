package com.rock.paper.scissors.sgd.ikl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.rock.paper.scissors.sgd.ikl.MainActivity.Companion.choise1
import com.rock.paper.scissors.sgd.ikl.MainActivity2.Companion.choise2
import kotlin.properties.Delegates

class finRound : AppCompatActivity() {
    var score1:Int = 0
    var score2:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fin_round)


        val player1Img = findViewById<ImageView>(R.id.pl1_img)
        val player2Img = findViewById<ImageView>(R.id.pl2_img)
        val finally = findViewById<TextView>(R.id.winner_text)
        val btnBack = findViewById<Button>(R.id.btn_back)
        btnBack.setOnClickListener {
            val backIntent = Intent(this,MainActivity::class.java)
            startActivity(backIntent)
        }


        if (choise1== "Paper"){player1Img.setImageResource(R.drawable.paper)}
        if (choise1== "Rock"){player1Img.setImageResource(R.drawable.rock)}
        if (choise1== "Scissors"){player1Img.setImageResource(R.drawable.scissors)}
        if (choise2== "Paper"){player2Img.setImageResource(R.drawable.paper)}
        if (choise2== "Rock"){player2Img.setImageResource(R.drawable.rock)}
        if (choise2== "Scissors"){player2Img.setImageResource(R.drawable.scissors)}

        if(choise1 == choise2){finally.text = "Draw"}

        if(choise1 == "Paper" && choise2 == "Rock"){
            finally.text = "First player wins"

        }
        if(choise1 == "Paper" && choise2 == "Scissors"){
            finally.text = "Second player wins"

        }
        if(choise1 == "Rock" && choise2 == "Paper"){
            finally.text = "Second player wins"

        }
        if(choise1 == "Rock" && choise2 == "Scissors"){
            finally.text = "First player wins"

        }

        if(choise1 == "Scissors" && choise2 == "Rock"){
            finally.text = "Second player wins"

        }
        if(choise1 == "Scissors" && choise2 == "Paper"){
            finally.text = "First player wins"

        }


    }
}



