package com.example.fmoya.horoscopo_chino;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by fmoya on 11-12-2017.
 */

    public class Signum extends SQLiteOpenHelper {
        String tabla2="CREATE TABLE SIGNI (SIGNUM TEXT,LEGEND TEXT, ELEMENT TEXT, YEAR TEXT)";
        public Signum (Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);

        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(tabla2);

        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
            sqLiteDatabase.execSQL("drop table signi");
            sqLiteDatabase.execSQL(tabla2);
        }
    }