package com.example.mypreloaddataexpert.database;

import android.provider.BaseColumns;

class DatabaseContract {
    public static String TABLE_NAME = "table_mahasiswa";

    public static final class MahasiswaColumns implements BaseColumns {
        public static final String NAMA = "nama";
        public static final String NIM = "nim";
    }
}
