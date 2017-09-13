package com.example.android.gardentour;

import static android.R.attr.name;

/**
 * Created by izzystannett on 21/05/2017.
 */

public class GardenItem {
    //define all variables
    private int mImageResourceID;
    private String mName;
    private String mColor = NO_COLOUR_PROVIDED;
    private int mNumberOfPetals = NO_PETALS_PROVIDED;
    private String mSize = NO_SIZE_PROVIDED;
    private String mIsGoodFor = NO_USE_PROVIDED;
    private String mIsChildFriendly = NO_STATUS_PROVIDED;

    private static final String NO_COLOUR_PROVIDED = "none";
    private static final int NO_PETALS_PROVIDED = -1;
    private static final String NO_SIZE_PROVIDED = "none";
    private static final String NO_USE_PROVIDED = "none";
    private static final String NO_STATUS_PROVIDED = "none";

    //SET CONSTANTS FOR VARIABLES THAT ONLY SOMETIMES EXIST

    //create constructor for flower item
    public GardenItem(int imageResourceID, String name, String color, int numberOfPetals) {
        mImageResourceID = imageResourceID;
        mName = name;
        mColor = color;
        mNumberOfPetals = numberOfPetals;
    }

    //create constructor for wildlife and vegetable items
    public GardenItem(int imageResourceID, String name, String color, String isGoodFor) {
        mImageResourceID = imageResourceID;
        mName = name;
        mColor = color;
        mIsGoodFor = isGoodFor;
    }

    //create constructor for tools item
    public GardenItem(int imageResourceID, String name, String size, String isGoodFor, String isChildFriendly) {
        mImageResourceID = imageResourceID;
        mName = name;
        mSize = size;
        mIsGoodFor = isGoodFor;
        mIsChildFriendly = isChildFriendly;
    }

    //set getter methods

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public String getmName() {
        return mName;
    }

    public String getmColor() {
        return mColor;
    }

    public String getmNumberOfPetals() {
        String numberOfPetals = String.valueOf(mNumberOfPetals);
        return numberOfPetals;
    }

    public String getmSize() {
        return mSize;
    }

    public String getmIsGoodFor() {
        return mIsGoodFor;
    }

    public String getmIsChildFriendly() {
        return mIsChildFriendly;
    }

    //set boolean methods to test whether certain properties exist for each type of garden item
    public boolean hasColor() {
        return mColor != NO_COLOUR_PROVIDED;
    }

    public boolean hasNumberOfPetals() {
        return mNumberOfPetals != NO_PETALS_PROVIDED;
    }

    public boolean hasSize() {
        return mSize != NO_SIZE_PROVIDED;
    }

    public boolean hasIsGoodFor() {
        return mIsGoodFor != NO_USE_PROVIDED;
    }

    public boolean hasIsChildFriendly() {
        return mIsChildFriendly != NO_STATUS_PROVIDED;
    }

}
