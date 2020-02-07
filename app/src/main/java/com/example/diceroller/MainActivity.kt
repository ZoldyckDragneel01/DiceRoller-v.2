package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var toIncrement: Int = 0
   lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

    }

    private fun  rollDice(){

        val randomInt: Int = (1..6).random()
        Toast.makeText(this, "Button is clicked. Dice successfully rolled!",
            Toast.LENGTH_SHORT).show()
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()
//        this.toIncrement = randomInt

        //val diceImage: ImageView = findViewById(R.id.dice_image)

        val drawableResouce = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResouce)
    }


}
