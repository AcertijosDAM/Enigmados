package com.example.jsanz.enigmados;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Acertijo extends Activity {
    String acertijo;
    String enunciado;
    String respuesta;
    String prueba;
    TextView tv;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acertijo);

        Bundle datos= getIntent().getExtras();
        acertijo=datos.getString("enigma");
        tv=(TextView) findViewById(R.id.enunciado);
        et=(EditText) findViewById(R.id.et_answer);

        rellenarDatos(acertijo);
    }

    public void rellenarDatos(String acertijo){


        if(acertijo.equals("Facil 01")){
            enunciado= getString(R.string.facil_01);
            respuesta=getString(R.string.solucion_facil_01);

            tv.setText(enunciado);
        }

    }

    public void onComprobar(View v){
        prueba=et.getText().toString();

        if(prueba.equals(respuesta)){
            Context context = getApplicationContext();

            int duration = Toast.LENGTH_SHORT;
            CharSequence text = "Respuesta correcta";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }else{
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text = "Respuesta incorrecta";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_acertijo, menu);
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
