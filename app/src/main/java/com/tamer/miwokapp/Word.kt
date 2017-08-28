package com.tamer.miwokapp

class Word(defaultTranslation: String, miwokTranslation: String) {

    /** Default translation for the word  */
    var mDefaultTrans: String? = defaultTranslation


    /** Miwok translation for the word */
    var mMiwokTrans: String? = miwokTranslation

//    /**
//     * Create a new Word object.
//     *
//     * @param defaultTranslation is the word in a language that the user is already familiar with
//     * (such as English)
//     * @param miwokTranslation is the word in the Miwok language
//     */
//    public fun Word(defaultTranslation: String, miwokTranslation: String) {
//        mDefaultTrans = defaultTranslation
//        mMiwokTrans = miwokTranslation
//
//    }


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


}