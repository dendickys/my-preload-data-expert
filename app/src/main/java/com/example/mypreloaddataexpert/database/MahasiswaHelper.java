package com.example.mypreloaddataexpert.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MahasiswaHelper {
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase database;
    private static MahasiswaHelper INSTANCE;

    public MahasiswaHelper(Context context) {
        databaseHelper = new DatabaseHelper(context);
    }

    public static MahasiswaHelper getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (SQLiteOpenHelper.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MahasiswaHelper(context);
                }
            }
        }
        return INSTANCE;
    }
}
