package com.tamer.miwokapp

import android.app.Activity
import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.item_list.view.*


/*
* {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Word} objects.
* */
class WordAdapter
/**
 * This is our own custom constructor (it doesn't mirror a superclass constructor).
 * The context is used to inflate the layout file, and the list is the data we want
 * to populate into the lists.
 *
 * @param context        The current context. Used to inflate the layout file.
 * @param words A List of Word objects to display in a list
 */
(context: Activity, words: ArrayList<Word>)// Here, we initialize the ArrayAdapter's internal storage for the context and the list.
// the second argument is used when the ArrayAdapter is populating a single TextView.
// Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
// going to use this second argument, so it can be any value. Here, we used 0.
    : ArrayAdapter<Word>(context, 0, words) {

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     * list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Check if the existing view is being reused, otherwise inflate the view
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(
                    R.layout.item_list, parent, false)
        }

        // Get the {@link Word} object located at this position in the list
        val currentWord = getItem(position)

        // Find the TextView in the item_list.xml layout with the ID default_text_view
        val mDefaultTrans = listItemView!!.default_text_view as TextView
        // Get the mDefaultTranslation from the current Word object and
        // set this text on the name TextView
        mDefaultTrans.text = currentWord.getDefaultTranslation()

        // Find the TextView in the item_list.xml layout with the ID miwok_text_view
        val mMiwokTrans = listItemView.miwok_text_view as TextView
        // Get the mMiwokTranslation from the current Word object and
        // set this text on the number TextView
        mMiwokTrans.text = currentWord.getMiwokTranslation()


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView
    }


}