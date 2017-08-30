package com.tamer.miwokapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.word_list.*

class ColorsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        //Create an ArrayList of words
        val words = ArrayList<Word>()

        words.add(Word("red", "weṭeṭṭi", R.drawable.color_red))
        words.add(Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow))
        words.add(Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow))
        words.add(Word("green", "chokokki", R.drawable.color_green))
        words.add(Word("brown", "ṭakaakki", R.drawable.color_brown))
        words.add(Word("gray", "ṭopoppi", R.drawable.color_gray))
        words.add(Word("black", "kululli", R.drawable.color_black))
        words.add(Word("white", "kelelli", R.drawable.color_white))


        //val rootView = rootView as LinearLayout


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        val itemsAdapter = WordAdapter(this, words,R.color.category_colors)

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
