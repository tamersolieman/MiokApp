package com.tamer.miwokapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.word_list.*

class FamilyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        //Create an ArrayList of words
        val words = ArrayList<Word>()

        words.add(Word("father", "әpә", R.drawable.family_father))
        words.add(Word("mother", "әṭa", R.drawable.family_mother))
        words.add(Word("son", "angsi", R.drawable.family_son))
        words.add(Word("daughter", "tune", R.drawable.family_daughter))
        words.add(Word("older brother", "taachi", R.drawable.family_older_brother))
        words.add(Word("younger brother", "chalitti", R.drawable.family_younger_brother))
        words.add(Word("older sister", "teṭe", R.drawable.family_older_sister))
        words.add(Word("younger sister", "kolliti", R.drawable.family_younger_sister))
        words.add(Word("grandmother ", "ama", R.drawable.family_grandmother))
        words.add(Word("grandfather", "paapa", R.drawable.family_grandfather))


        //val rootView = rootView as LinearLayout


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        val itemsAdapter = WordAdapter(this, words,R.color.category_family)

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
