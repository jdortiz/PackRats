package com.powwau.packrats;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * 20150205. Initial version created by jorge.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {
    private final static String LOG_TAG = DatabaseHelper.class.getSimpleName();
    private final static String DATABASE_NAME = "documents.db";
    private final static int DATABASE_VERSION = 1;
    private Dao<Document,Integer> mDocumentDao;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public Dao<Document, Integer> getDocumentDao() throws SQLException {
        if (mDocumentDao == null) {
            mDocumentDao = getDao(Document.class);
        }
        return mDocumentDao;
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            Log.i(LOG_TAG, "Creating database.");
            TableUtils.createTable(connectionSource, Document.class);
        } catch (SQLException e) {
            Log.e(LOG_TAG, "Failed to create database.", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }
}
