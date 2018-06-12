package com.example.citel2018.streetartnaples;

/**
 * Opera - IS THE DATA MODEL, represents a single masterpeace (street art element in Naples)  that the user wants to be informed
 * It contains image, title, name , address, description and maybe maps.
 */

public class Opera {

    /**
     * String resource ID for the Author of the opera
     */
    private int mAuthorId;

    /**
     * String resource ID for the Title of the opera
     */
    private int mTitleId;

    /**
     * String resource ID for the Title of the opera
     */
    private int mAddressId;

    /**
     * String resource ID for the Title of the opera
     */
    private int mDescriptionId;

    /**
     * Image resource ID for the opera
     */
    private int mImageResourceId;

    //**Location for the opera

    private int mLocation;



/**
 * Create a new Word object.
 */

public Opera(int imageResourceId, int authorId, int titleId, int addressId, int descriptionId, int locationData){

    mImageResourceId =  imageResourceId;
    mAuthorId = authorId;
    mTitleId = titleId;
    mAddressId = addressId;
    mDescriptionId = descriptionId;
    mLocation = locationData;

    }
    /**
     * Get the location of the opera.
     */
    public int getLocation() {
        return mLocation;
    }


    /**
     * Get the image of the opera.
     */
    public int getStreetImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the string resource ID for author of the opera.
     */
    public int getStreetAuthorId() {
        return mAuthorId;
    }

    /**
     * Get the string resource ID for Title of the opera.
     */
    public int getStreetTitleId() {
        return mTitleId;
    }

    /**
     * Get the string resource ID for Address of the opera.
     */
    public int getStreetAddressId() {
        return mAddressId;
    }

    /**

     * Get the string resource ID for author of the opera.
     */
    public int getStreetDescriptionId() {return mDescriptionId;}


}
