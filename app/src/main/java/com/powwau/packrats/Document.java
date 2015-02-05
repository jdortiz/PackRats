package com.powwau.packrats;


import android.content.SharedPreferences;

import com.j256.ormlite.field.DatabaseField;

import java.util.Date;

/**
 * 20150205. Initial version created by jorge.
 */
public class Document {

    public final static String ID = "_id";
    public final static String TITLE = "title";
    public final static String CONTENTS = "contents";
    public final static String CREATION_DATE = "creation_date";

    @DatabaseField(generatedId = true, columnName = ID) private int _id;
    @DatabaseField(columnName = TITLE) private String mTitle;
    @DatabaseField(columnName = CONTENTS) private String mContents;
    @DatabaseField(columnName = CREATION_DATE) private Date mCreation = new Date();

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getContents() {
        return mContents;
    }

    public void setContents(String contents) {
        mContents = contents;
    }

    public Date getCreation() {
        return mCreation;
    }

    public String toString() {
        return mTitle + " : " + mContents;
    }
}
