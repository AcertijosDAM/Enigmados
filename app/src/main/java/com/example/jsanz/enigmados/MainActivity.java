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


    public static int puntos=100 ;
    public static int acertados;

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
