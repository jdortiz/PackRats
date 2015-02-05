package com.powwau.packrats;


import java.util.Date;

/**
 * 20150205. Initial version created by jorge.
 */
public class Document {
    private String mTitle;
    private String mContents;
    private Date mCreation = new Date();

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
