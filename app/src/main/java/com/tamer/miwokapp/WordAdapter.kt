package com.tamer.miwokapp

import android.app.Activity
import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.item_list.view.*


/*
* {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Word} objects.
* */
class WordAdapter(context: Activity, words: ArrayList<Word>, colorResourceId: Int) : ArrayAdapter<Word>(context, 0, words) {

    private var mColorResourceID: Int = colorResourceId


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

        // Find the TextView in the item_list.xml layout with the ID imageView
        val mImageResource = listItemView.imageView as ImageView

        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            mImageResource.setImageResource(currentWord.getImageIcon())
            // Make sure the view is visible
            mImageResource.visibility = View.VISIBLE
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            mImageResource.visibility = View.GONE
        }


        //set color

        val textContainer = listItemView.text_container as LinearLayout

        val color:Int = ContextCompat.getColor(context,mColorResourceID)
        textContainer.setBackgroundColor(color)

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView
    }


}