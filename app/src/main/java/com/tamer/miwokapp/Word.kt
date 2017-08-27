package com.tamer.miwokapp


public class Word {

    /** Default translation for the word  */
    private var mDefaultTranslation: String? = null


    /** Miwok translation for the word */
    private var mMiwokTranslation: String? = null

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    fun Word(defaultTranslation: String, miwokTranslation: String) {
        mDefaultTranslation = defaultTranslation
        mMiwokTranslation = miwokTranslation

    }


    /**
     * Get the default translation of the word.
     */
    public fun getDefaultTranslation(): String {
        return mDefaultTranslation.toString()
    }

    /**
     * Get the Miwok translation of the word.
     */
    public fun getMiwokTranslation(): String {
        return mMiwokTranslation.toString()
    }


}