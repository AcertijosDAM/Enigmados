package com.example.jsanz.enigmados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLHelper extends SQLiteOpenHelper{
    String crearTabla= "CREATE TABLE enigmas (id NUMBER primary key, acertado CHAR(1))";
    public SQLHelper(Context contexto, String nombre, CursorFactory factory, int version){
        super(contexto,nombre,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(crearTabla);




        }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists enigmas");
        db.execSQL(crearTabla);
    }
}
