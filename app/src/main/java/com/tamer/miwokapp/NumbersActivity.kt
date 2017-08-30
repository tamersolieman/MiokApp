package com.tamer.miwokapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.word_list.*


class NumbersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        //Create an ArrayList of words
        val words = ArrayList<Word>()

        words.add(Word("One", "lutti", R.drawable.number_one))
        words.add(Word("two", "otiiko", R.drawable.number_two))
        words.add(Word("three", "tolookosu", R.drawable.number_three))
        words.add(Word("four", "oyyisa", R.drawable.number_four))
        words.add(Word("five", "massokka", R.drawable.number_five))
        words.add(Word("six", "temmokka", R.drawable.number_six))
        words.add(Word("seven", "kenekaku", R.drawable.number_seven))
        words.add(Word("eight", "kawinta", R.drawable.number_eight))
        words.add(Word("nine", "wo’e", R.drawable.number_nine))
        words.add(Word("ten", "na’aacha", R.drawable.number_ten))


        //val rootView = rootView as LinearLayout


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        val itemsAdapter = WordAdapter(this, words,R.color.category_numbers)

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        val listView = listView as ListView

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.adapter = itemsAdapter


    }

}
