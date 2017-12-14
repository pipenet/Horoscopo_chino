package com.example.fmoya.horoscopo_chino;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class BaseHelper extends SQLiteOpenHelper {
    String tabla="CREATE TABLE USUARIO (USUARIO TEXT,PASSWORD TEXT, DIA TEXT, MES TEXT, ANIO TEXT)";
    public BaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(tabla);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("drop table usuario");
        sqLiteDatabase.execSQL(tabla);
    }
}