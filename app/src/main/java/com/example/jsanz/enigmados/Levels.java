package com.example.jsanz.enigmados;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Levels extends Activity {

    private ListView list;
    private String[] levels = {"Facil","Medio","Dificil","Criptogramas"};
    String level="";
    int points = MainActivity.getPuntos();
    int aciertos=MainActivity.getAcertados();
    String prueba;
    String prueba2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        prueba=Integer.toString(points);
        prueba2=Integer.toString(aciertos);

        list=(ListView) findViewById(R.id.list_levels);
        /*ArrayList<Niveles> niveles = obtenerNiveles();
        ItemNivelAdapter adapter = new ItemNivelAdapter(this,niveles);
        list.setAdapter(adapter);*/
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,levels);
        list.setAdapter(adaptador);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                level=list.getItemAtPosition(position).toString();
                Intent i = new Intent(getApplicationContext(),Seleccion_acertijo.class);

                Bundle extras = new Bundle();
                extras.putString("key",level);
                i.putExtras(extras);
                startActivity(i);
            }
        });

    }
    /*
    private ArrayList<Niveles> obtenerNiveles(){

        ArrayList<Niveles> items = new ArrayList<Niveles>();
        items.add(new ItemNivel( "Facil", "drawable/patatas"));
        items.add(new ItemCompra( "Medio", "drawable/naranjas"));
        items.add(new ItemCompra( "Dificil",  "drawable/lechuga"));

        return items;


    }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_levels, menu);
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
