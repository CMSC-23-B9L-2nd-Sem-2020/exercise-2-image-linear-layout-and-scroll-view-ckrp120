package com.example.exer2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn: Button = findViewById(R.id.start)

        startBtn.setOnClickListener{ randomizeCharacter() }
    }

    private fun randomizeCharacter(){
        val charView: ImageView = findViewById(R.id.charView)
        val nameView: TextView = findViewById(R.id.title)
        val descView: TextView = findViewById(R.id.description)

        val randomInt = (1..10).random()

        val charName = when (randomInt){
            1 -> R.string.chernabog
            2 -> R.string.claude
            3 -> R.string.cruella
            4 -> R.string.gaston
            5 -> R.string.grimhilde
            6 -> R.string.hades
            7 -> R.string.jafar
            8 -> R.string.tremaine
            9 -> R.string.scar
            10 -> R.string.ursula
            else -> R.string.title
        }

        val charDes = when (randomInt){
            1 -> R.string.desc_chernabog
            2 -> R.string.desc_claude
            3 -> R.string.desc_cruella
            4 -> R.string.desc_gaston
            5 -> R.string.desc_grimhilde
            6 -> R.string.desc_hades
            7 -> R.string.desc_jafar
            8 -> R.string.desc_tremaine
            9 -> R.string.desc_scar
            10 -> R.string.desc_ursula
            else -> R.string.blank
        }

        val charImg = when (randomInt){
            1 -> R.drawable.chernabog
            2 -> R.drawable.claude
            3 -> R.drawable.cruella
            4 -> R.drawable.gaston
            5 -> R.drawable.grimhilde
            6 -> R.drawable.hades
            7 -> R.drawable.jafar
            8 -> R.drawable.tremaine
            9 -> R.drawable.scar
            10 -> R.drawable.urusla
            else -> R.drawable.disneylogo
        }


        charView.setImageResource(charImg)
        descView.setText(charDes)
        nameView.setText(charName)

    }


}
