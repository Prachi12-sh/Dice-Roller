package com.prachi.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button =findViewById(R.id.button)
        rollButton.setOnClickListener{ rollDice() }
    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice=Dice(6)
        val diceImage : ImageView = findViewById(R.id.imageView)
        val diceRoll =dice.roll()
        if(diceRoll==1)
           diceImage.setImageResource(R.drawable.dice_1)
        else if(diceRoll==2)
           diceImage.setImageResource(R.drawable.dice_2)
        else if(diceRoll==3)
           diceImage.setImageResource(R.drawable.dice_3)
        else if(diceRoll==4)
           diceImage.setImageResource(R.drawable.dice_4)
        else if(diceRoll==5)
           diceImage.setImageResource(R.drawable.dice_5)
        else
            diceImage.setImageResource(R.drawable.dice_6)
        diceImage.contentDescription = diceRoll.toString()
    }
}
class Dice(private val numSides: Int) {
    fun roll(): Int { return (1..numSides).random() }
    }



