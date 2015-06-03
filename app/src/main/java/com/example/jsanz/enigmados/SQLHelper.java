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

        int enigmas []={
                R.string.facil_01,
                R.string.facil_02,
                R.string.facil_03,
                R.string.facil_04,
                R.string.facil_05,
                R.string.facil_06,
                R.string.facil_07,
                R.string.facil_08,
                R.string.facil_09,
                R.string.facil_10,
                R.string.medio_01,
                R.string.medio_02,
                R.string.medio_03,
                R.string.medio_04,
                R.string.medio_05,
                R.string.medio_06,
                R.string.medio_07,
                R.string.medio_08,
                R.string.medio_09,
                R.string.medio_10,
                R.string.dificil_01,
                R.string.dificil_02,
                R.string.dificil_03,
                R.string.dificil_04,
                R.string.dificil_05,
                R.string.dificil_06,
                R.string.dificil_07,
                R.string.dificil_08,
                R.string.dificil_09,
                R.string.dificil_10,
                R.string.criptograma_01,
                R.string.criptograma_02,
                R.string.criptograma_03,
                R.string.criptograma_04,
                R.string.criptograma_05,
                R.string.criptograma_06,
                R.string.criptograma_07};

        for (int i = 0; i < 36; i++) {

            db.execSQL("INSERT INTO enigmas VALUES("+enigmas[i]+",'N')");

        }
        db.close();




        }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists enigmas");
        db.execSQL(crearTabla);
    }
}
