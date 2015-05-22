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


public class Seleccion_acertijo extends Activity {

    private ListView list;
    String acertijo="";


    private String[] facil = {"Facil 01", "Facil 02", "Facil 03","Facil 04","Facil 05",
            "Facil 06","Facil 07","Facil 08","Facil 09","Facil 10"};
    private String[] medio = {"Medio 01", "Medio 02", "Medio 03","Medio 04","Medio 05",
            "Medio 06","Medio 07","Medio 08","Medio 09","Medio 10"};
    private String[] dificil = {"Dificil 01", "Dificil 02", "Dificil 03","Dificil 04","Dificil 05",
            "Dificil 06","Dificil 07","Dificil 08","Dificil 09","Dificil 10"};
    private String[] criptogramas = {"Criptograma 01", "Criptograma 02", "Criptograma 03","Criptograma 04","Criptograma 05",
            "Criptograma 06","Criptograma 07","Criptograma 08","Criptograma 09","Criptograma 10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_acertijo);

        Bundle datos= getIntent().getExtras();
        String nivel = datos.getString("key");
        list = (ListView)findViewById(R.id.list_acertijos);

        if(nivel.equals("Facil")){
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, facil);
            list.setAdapter(adaptador);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener(){


                public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {

                    acertijo=list.getItemAtPosition(position).toString();
                    Intent i = new Intent(getApplicationContext(),Acertijo.class);
                    Bundle easy= new Bundle();
                    easy.putString("enigma",acertijo);
                    i.putExtras(easy);
                    startActivity(i);

                }

            });
        }else if(nivel.equals("Medio")){
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, medio);
            list.setAdapter(adaptador);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener(){


                public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {

                    acertijo=list.getItemAtPosition(position).toString();
                    Intent i = new Intent(getApplicationContext(),Acertijo.class);
                    Bundle medium=new Bundle();
                    medium.putString("enigma",acertijo);
                    i.putExtras(medium);
                    startActivity(i);

                }

            });
        }else if(nivel.equals("Dificil")){
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dificil);
            list.setAdapter(adaptador);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener(){


                public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {

                    acertijo=list.getItemAtPosition(position).toString();
                    Intent i = new Intent(getApplicationContext(),Acertijo.class);
                    Bundle hard= new Bundle();
                    hard.putString("enigma",acertijo);
                    i.putExtras(hard);
                    startActivity(i);

                }

            });
        }else if(nivel.equals("Criptogramas")){
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, criptogramas);
            list.setAdapter(adaptador);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener(){


                public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {

                    acertijo=list.getItemAtPosition(position).toString();
                    Intent i = new Intent(getApplicationContext(),Acertijo.class);
                    Bundle cript=new Bundle();
                    cript.putString("enigma",acertijo);
                    i.putExtras(cript);
                    startActivity(i);

                }

            });

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_seleccion_acertijo, menu);
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
