package com.tamer.miwokapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.word_list.*

class PhrasesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        //Create an ArrayList of words
        val words = ArrayList<Word>()

        words.add(Word("Where are you going?", "minto wuksus"))
        words.add(Word("What is your name?", "tinnә oyaase'nә"))
        words.add(Word("My name is...", "oyaaset..."))
        words.add(Word("How are you feeling?", "michәksәs?"))
        words.add(Word("I’m feeling good.", "kuchi achit"))
        words.add(Word("Are you coming?", "әәnәs'aa?"))
        words.add(Word("Yes, I’m coming.", "hәә’ әәnәm"))
        words.add(Word("I’m coming.", "әәnәm"))
        words.add(Word("Let’s go.", "yoowutis"))
        words.add(Word("Come here.", "әnni'nem"))


        //val rootView = rootView as LinearLayout


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        val itemsAdapter = WordAdapter(this, words)

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
