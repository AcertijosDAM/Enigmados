package com.example.jsanz.enigmados;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



public class MainActivity extends Activity {
    SQLHelper sqlh;
    SQLiteDatabase db ;


    public static int puntos = 0;
    public static int acertados=0;

    public static int getPuntos() {
        return puntos;
    }

    public static void setPuntos(int puntos) {
        MainActivity.puntos = puntos;
    }

    public static int getAcertados() {
        return acertados;
    }

    public static void setAcertados(int acertados) {
        MainActivity.acertados = acertados;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sqlh = new SQLHelper(this, "enigmas", null, 1);
        db = sqlh.getWritableDatabase();

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


    public void toInfo(View v){
        Intent i = new Intent(this,Info.class);
        startActivity(i);
    }

    public void toPlay(View v){
        Intent i =new Intent(this,Levels.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
