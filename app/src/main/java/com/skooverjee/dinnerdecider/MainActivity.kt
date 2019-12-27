package com.skooverjee.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Pizza", "Burgers", "Pasta")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())

            selectedFoodText.text = foodList[randomFood]
        }

        addFoodButton.setOnClickListener {
            val newFood = addFoodText.text.toString()
            if (newFood != "")
                foodList.add(newFood)

            addFoodText.text.clear()
        }
    }

}
