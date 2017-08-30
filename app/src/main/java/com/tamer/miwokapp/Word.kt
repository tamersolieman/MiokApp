package com.tamer.miwokapp

/**
 * [Word] represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */
class Word {

    /** Default translation for the word  */
    /**
     * Get the default translation of the word.
     */
    private var mDefaultTrans: String? = null


    /** Miwok translation for the word  */
    /**
     * Get the Miwok translation of the word.
     */
    private var mMiwokTrans: String? = null


    /**
     * Create a constant variable NO_IMAGE_PROVIDED
     */
    private val NO_IMAGE_PROVIDED = -1

    /** Image resource ID for the word and make default value is NO_IMAGE_PROVIDED */
    /**
     * Get the image resource ID of the word.
     */
    private var mImageResourceID: Int = NO_IMAGE_PROVIDED


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    constructor(defaultTranslation: String, miwokTranslation: String) {
        this.mDefaultTrans = defaultTranslation
        this.mMiwokTrans = miwokTranslation
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    constructor(defaultTranslation: String, miwokTranslation: String, imageResourceId: Int) {
        this.mDefaultTrans = defaultTranslation
        this.mMiwokTrans = miwokTranslation
        this.mImageResourceID = imageResourceId
    }

    /**
     * Get the default translation of the word.
     */
    fun getDefaultTranslation(): String {
        return mDefaultTrans.toString()
    }

    /**
     * Get the Miwok translation of the word.
     */
    fun getMiwokTranslation(): String {
        return mMiwokTrans.toString()
    }

    /**
     * Get the image of the word
     */
    fun getImageIcon(): Int {
        return mImageResourceID
    }

    /**
     * Return whether there's an image or not
     */
    fun hasImage(): Boolean {
        return mImageResourceID != NO_IMAGE_PROVIDED
    }


}

