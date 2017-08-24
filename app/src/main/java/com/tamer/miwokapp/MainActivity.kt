package com.tamer.miwokapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.view.menu.MenuBuilder
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView
import android.widget.Toast
import com.tamer.miwokapp.R.id.colors


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declare a variable from NumberClickListener class
        //val clickListener = NumbersClickListener()

        // Find the view that shows the numbers category
        val numbers = numbers as TextView
        //set a click listener on that view
        numbers.setOnClickListener(object :View.OnClickListener {
            // The code in this method will be executed when the numbers category is clicked on.
            override fun onClick(view: View?):Unit {
                // Create a new intent to open the {@link NumbersActivity}
                val numbersIntent = Intent(this@MainActivity, NumbersActivity::class.java)
                // Start the new activity
                startActivity(numbersIntent)

//                Toast.makeText(this@MainActivity,"Open the list of Numbers", Toast.LENGTH_LONG).show()
            }
        })


        // Find the View that shows the family category
        val family = family as TextView
        // Set a click listener on that View
        family.setOnClickListener(object :View.OnClickListener{
            // The code in this method will be executed when the family category is clicked on.
            override fun onClick(view: View) {
                // Create a new intent to open the {@link FamilyActivity}
                val familyIntent = Intent(this@MainActivity, FamilyActivity::class.java)
                // Start the new activity
                startActivity(familyIntent)
            }
        })

        // Find the View that shows the colors category
        val colors = colors as TextView

        // Set a click listener on that View
        colors.setOnClickListener(object :View.OnClickListener {
            // The code in this method will be executed when the colors category is clicked on.
            override fun onClick(view: View) {
                // Create a new intent to open the {@link ColorsActivity}
                val colorsIntent = Intent(this@MainActivity, ColorsActivity::class.java)

                // Start the new activity
                startActivity(colorsIntent)
            }
        })

        // Find the View that shows the phrases category
        val phrases = phrases as TextView

        // Set a click listener on that View
        phrases.setOnClickListener(object : View.OnClickListener{
            // The code in this method will be executed when the phrases category is clicked on.
            override fun onClick(view: View) {
                // Create a new intent to open the {@link PhrasesActivity}
                val phrasesIntent = Intent(this@MainActivity, PhrasesActivity::class.java)

                // Start the new activity
                startActivity(phrasesIntent)
            }
        })
    }


    /**
     * openNumbersList is the function to redirect to NumbersActivity
     */

    //    public fun openNumbersList(view: View){
//        val i = Intent(this, NumbersActivity::class.java)
//
//        startActivity(i)
//
//    }
}
