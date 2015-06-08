package com.example.jsanz.enigmados;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.database.sqlite.SQLiteDatabase;



public class Acertijo extends Activity {
    String acertijo;
    String enunciado;
    String respuesta;
    String prueba;
    TextView tv;
    EditText et;
    TextView pts;
    TextView acrts;
    int points = MainActivity.getPuntos();
    int aciertos = MainActivity.getAcertados();
    String probar;
    String probar2;
    String pista1;
    String pista2;
    int numPistas=0;
    ImageView iv;
    TextView tv2;
    String msj_puntos;

    SQLHelper sqlh ;
    SQLiteDatabase db ;
    int id;
    int puntos = MainActivity.getPuntos();
    int acertados= MainActivity.getAcertados();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acertijo);

        Bundle datos= getIntent().getExtras();
        acertijo=datos.getString("enigma");
        tv=(TextView) findViewById(R.id.enunciado);
        tv2=(TextView)findViewById(R.id.textView);
        et=(EditText) findViewById(R.id.et_answer);
        pts = (TextView) findViewById(R.id.puntos);
        acrts = (TextView) findViewById(R.id.aciertos);
        iv = (ImageView) findViewById(R.id.bombilla);
        iv.setOnClickListener(Pista);

        probar=Integer.toString(points);
        probar2=Integer.toString(aciertos);
        msj_puntos = "Tienes "+probar+" puntos";
        tv2.setText(msj_puntos);

        /*

        pts.setText(probar);
        acrts.setText(aciertos);*/

        rellenarDatos(acertijo);

        sqlh = new SQLHelper(this,"enigmas",null,1);
        db = sqlh.getWritableDatabase();

    }


    public void rellenarDatos(String acertijo){

        //pts.setText(probar);
        //acrts.setText(probar2);


        switch(acertijo){
            //niveles faciles

            case "Facil 01": enunciado= getString(R.string.facil_01);
                respuesta=getString(R.string.solucion_facil_01).toLowerCase();
                id=R.string.facil_01;
                pista1=getString(R.string.pista1_facil_01).toString();
                pista2=getString(R.string.pista2_facil_01).toString();

                tv.setText(enunciado);

                break;
            case "Facil 02": enunciado= getString(R.string.facil_02);
                respuesta=getString(R.string.solucion_facil_02);
                id=R.string.facil_02;
                pista1=getString(R.string.pista1_facil_02).toString();
                pista2=getString(R.string.pista2_facil_02).toString();

                tv.setText(enunciado);
                break;
            case "Facil 03": enunciado= getString(R.string.facil_03);
                respuesta=getString(R.string.solucion_facil_03);
                id=R.string.facil_03;
                pista1=getString(R.string.pista1_facil_03).toString();
                pista2=getString(R.string.pista2_facil_03).toString();

                tv.setText(enunciado);
                break;
            case "Facil 04": enunciado= getString(R.string.facil_04);
                respuesta=getString(R.string.solucion_facil_04);
                id=R.string.facil_04;
                pista1=getString(R.string.pista1_facil_04).toString();
                pista2=getString(R.string.pista2_facil_04).toString();

                tv.setText(enunciado);
                break;
            case "Facil 05": enunciado= getString(R.string.facil_05);
                respuesta=getString(R.string.solucion_facil_05);
                id=R.string.facil_05;
                pista1=getString(R.string.pista1_facil_05).toString();
                pista2=getString(R.string.pista2_facil_05).toString();

                tv.setText(enunciado);
                break;
            case "Facil 06": enunciado= getString(R.string.facil_06);
                respuesta=getString(R.string.solucion_facil_06);
                id=R.string.facil_06;
                pista1=getString(R.string.pista1_facil_06).toString();
                pista2=getString(R.string.pista2_facil_06).toString();

                tv.setText(enunciado);
                break;
            case "Facil 07": enunciado= getString(R.string.facil_07);
                respuesta=getString(R.string.solucion_facil_07).toLowerCase();
                id=R.string.facil_07;
                pista1=getString(R.string.pista1_facil_07).toString();
                pista2=getString(R.string.pista2_facil_07).toString();

                tv.setText(enunciado);
                break;
            case "Facil 08": enunciado= getString(R.string.facil_08);
                respuesta=getString(R.string.solucion_facil_08).toLowerCase();
                id=R.string.facil_08;
                pista1=getString(R.string.pista1_facil_08).toString();
                pista2=getString(R.string.pista2_facil_08).toString();

                tv.setText(enunciado);
                break;
            case "Facil 09": enunciado= getString(R.string.facil_09);
                respuesta=getString(R.string.solucion_facil_09);
                id=R.string.facil_09;
                pista1=getString(R.string.pista1_facil_09).toString();
                pista2=getString(R.string.pista2_facil_09).toString();

                tv.setText(enunciado);
                break;
            case "Facil 10": enunciado= getString(R.string.facil_10);
                respuesta=getString(R.string.solucion_facil_10).toLowerCase();
                id=R.string.facil_10;
                pista1=getString(R.string.pista1_facil_10).toString();
                pista2=getString(R.string.pista2_facil_10).toString();

                tv.setText(enunciado);
                break;
            // niveles medios


            case "Medio 01": enunciado= getString(R.string.medio_01);
                respuesta=getString(R.string.solucion_medio_01).toLowerCase();
                id=R.string.medio_01;
                pista1=getString(R.string.pista1_medio_01).toString();
                pista2=getString(R.string.pista2_medio_01).toString();

                tv.setText(enunciado);
                break;
            case "Medio 02": enunciado= getString(R.string.medio_02);
                respuesta=getString(R.string.solucion_medio_02).toLowerCase();
                id=R.string.medio_02;
                pista1=getString(R.string.pista1_medio_02).toString();
                pista2=getString(R.string.pista2_medio_02).toString();

                tv.setText(enunciado);
                break;
            case "Medio 03": enunciado= getString(R.string.medio_03);
                respuesta=getString(R.string.solucion_medio_03);
                id=R.string.medio_03;
                pista1=getString(R.string.pista1_medio_03).toString();
                pista2=getString(R.string.pista2_medio_03).toString();

                tv.setText(enunciado);
                break;
            case "Medio 04": enunciado= getString(R.string.medio_04);
                respuesta=getString(R.string.solucion_medio_04);
                id=R.string.medio_04;
                pista1=getString(R.string.pista1_medio_04).toString();
                pista2=getString(R.string.pista2_medio_04).toString();

                tv.setText(enunciado);
                break;
            case "Medio 05": enunciado= getString(R.string.facil_05);
                respuesta=getString(R.string.solucion_medio_05);
                id=R.string.medio_05;
                pista1=getString(R.string.pista1_medio_05).toString();
                pista2=getString(R.string.pista2_medio_05).toString();

                tv.setText(enunciado);
                break;
            case "Medio 06": enunciado= getString(R.string.facil_06);
                respuesta=getString(R.string.solucion_medio_06);
                id=R.string.medio_06;
                pista1=getString(R.string.pista1_medio_06).toString();
                pista2=getString(R.string.pista2_medio_06).toString();

                tv.setText(enunciado);
                break;
            case "Medio 07": enunciado= getString(R.string.medio_07);
                respuesta=getString(R.string.solucion_medio_07);
                id=R.string.medio_07;
                pista1=getString(R.string.pista1_medio_07).toString();
                pista2=getString(R.string.pista2_medio_07).toString();
                tv.setText(enunciado);
                break;
            case "Medio 08": enunciado= getString(R.string.medio_08);
                respuesta=getString(R.string.solucion_medio_08);
                id=R.string.medio_08;
                pista1=getString(R.string.pista1_medio_08).toString();
                pista2=getString(R.string.pista2_medio_08).toString();

                tv.setText(enunciado);
                break;
            case "Medio 09": enunciado= getString(R.string.medio_09);
                respuesta=getString(R.string.solucion_medio_09);
                id=R.string.medio_09;
                pista1=getString(R.string.pista1_medio_09).toString();
                pista2=getString(R.string.pista2_medio_09).toString();

                tv.setText(enunciado);
                break;
            case "Medio 10": enunciado= getString(R.string.medio_10);
                respuesta=getString(R.string.solucion_medio_10);
                id=R.string.medio_10;
                pista1=getString(R.string.pista1_medio_10).toString();
                pista2=getString(R.string.pista2_medio_10).toString();

                tv.setText(enunciado);
                break;

            //niveles difciles

            case "Dificil 01": enunciado= getString(R.string.dificil_01);
                respuesta=getString(R.string.solucion_dificil_01).toLowerCase();
                id=R.string.dificil_01;
                pista1=getString(R.string.pista1_dificil_01).toString();
                pista2=getString(R.string.pista2_dificil_01).toString();

                tv.setText(enunciado);
                break;
            case "Dificil 02": enunciado= getString(R.string.dificil_02);
                respuesta=getString(R.string.solucion_dificil_02).toLowerCase();
                id=R.string.dificil_02;
                pista1=getString(R.string.pista1_dificil_02).toString();
                pista2=getString(R.string.pista2_dificil_02).toString();

                tv.setText(enunciado);
                break;
            case "Dificil 03": enunciado= getString(R.string.dificil_03);
                respuesta=getString(R.string.solucion_dificil_03).toLowerCase();
                id=R.string.dificil_03;
                pista1=getString(R.string.pista1_dificil_03).toString();
                pista2=getString(R.string.pista2_dificil_03).toString();

                tv.setText(enunciado);
                break;
            case "Dificil 04": enunciado= getString(R.string.dificil_04);
                respuesta=getString(R.string.solucion_dificil_04);
                id=R.string.dificil_04;
                pista1=getString(R.string.pista1_dificil_04).toString();
                pista2=getString(R.string.pista2_dificil_04).toString();

                tv.setText(enunciado);
                break;
            case "Dificil 05": enunciado= getString(R.string.dificil_05);
                respuesta=getString(R.string.solucion_dificil_05);
                id=R.string.dificil_05;
                pista1=getString(R.string.pista1_dificil_05).toString();
                pista2=getString(R.string.pista2_dificil_05).toString();

                tv.setText(enunciado);
                break;
            case "Dificil 06": enunciado= getString(R.string.dificil_06);
                respuesta=getString(R.string.solucion_dificil_06);
                id=R.string.dificil_06;
                pista1=getString(R.string.pista1_dificil_06).toString();
                pista2=getString(R.string.pista2_dificil_06).toString();

                tv.setText(enunciado);
                break;
            case "Dificil 07": enunciado= getString(R.string.dificil_07);
                respuesta=getString(R.string.solucion_dificil_07);
                id=R.string.dificil_07;
                pista1=getString(R.string.pista1_dificil_07).toString();
                pista2=getString(R.string.pista2_dificil_07).toString();

                tv.setText(enunciado);
                break;
            case "Dificil 08": enunciado= getString(R.string.dificil_08);
                respuesta=getString(R.string.solucion_dificil_08);
                id=R.string.dificil_08;
                pista1=getString(R.string.pista1_dificil_08).toString();
                pista2=getString(R.string.pista2_dificil_08).toString();

                tv.setText(enunciado);
                break;
            case "Dificil 09": enunciado= getString(R.string.dificil_09);
                respuesta=getString(R.string.solucion_dificil_09);
                id=R.string.dificil_09;
                pista1=getString(R.string.pista1_dificil_09).toString();
                pista2=getString(R.string.pista2_dificil_09).toString();

                tv.setText(enunciado);
                break;
            case "Dificil 10": enunciado= getString(R.string.dificil_10);
                respuesta=getString(R.string.solucion_dificil_10);
                id=R.string.dificil_10;
                pista1=getString(R.string.pista1_dificil_10).toString();
                pista2=getString(R.string.pista2_dificil_10).toString();
                tv.setText(enunciado);
                break;

            //Criptogramas

            case "Criptograma 01": enunciado= getString(R.string.criptograma_01);
                respuesta=getString(R.string.solucion_criptograma_01);
                id=R.string.criptograma_01;

                tv.setText(enunciado);
                break;
            case "Criptograma 02": enunciado= getString(R.string.criptograma_02);
                respuesta=getString(R.string.solucion_criptograma_02);
                id=R.string.criptograma_02;

                tv.setText(enunciado);
                break;
            case "Criptograma 03": enunciado= getString(R.string.criptograma_03);
                respuesta=getString(R.string.solucion_criptograma_03);
                id=R.string.criptograma_03;

                tv.setText(enunciado);
                break;
            case "Criptograma 04": enunciado= getString(R.string.criptograma_04);
                respuesta=getString(R.string.solucion_criptograma_04);
                id=R.string.criptograma_04;

                tv.setText(enunciado);
                break;
            case "Criptograma 05": enunciado= getString(R.string.criptograma_05);
                respuesta=getString(R.string.solucion_criptograma_05);
                id=R.string.criptograma_05;

                tv.setText(enunciado);
                break;
            case "Criptograma 06": enunciado= getString(R.string.criptograma_06);
                respuesta=getString(R.string.solucion_criptograma_06);
                id=R.string.criptograma_06;

                tv.setText(enunciado);
                break;
            case "Criptograma 07": enunciado= getString(R.string.criptograma_07);
                respuesta=getString(R.string.solucion_criptograma_07);
                id=R.string.criptograma_07;

                tv.setText(enunciado);
                break;



            default: break;
        }

    }

    public void onComprobar(View v){
        prueba=et.getText().toString();

        if(prueba.equals(respuesta)){
            Context context = getApplicationContext();
            points = points+10;
            MainActivity.setPuntos(points);
            aciertos= aciertos +1;
            MainActivity.setAcertados(aciertos);
            numPistas = 0;



            int duration = Toast.LENGTH_SHORT;
            CharSequence text = "Respuesta correcta";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            SQLHelper sqlh ;
            SQLiteDatabase db ;
            sqlh = new SQLHelper(this,"enigmas",null,1);
            db = sqlh.getWritableDatabase();
            db.execSQL("update enigmas set acertado='S' where id="+id);
            finish();

        }else{
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text = "Respuesta incorrecta. Intenta reformular la respuesta";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            MainActivity.setPuntos(points);
            MainActivity.setAcertados(aciertos);

        }
    }
    View.OnClickListener Pista = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            mostrarPuntos();

            if (numPistas==0 && points>=10){
                pts.setText(pista1);
                numPistas= numPistas + 1;
                points= points-10;


                MainActivity.setAcertados(aciertos);
                MainActivity.setPuntos(points);

                mostrarPuntos();

            }else if(numPistas == 1 && points>=60 ){
                acrts.setText(pista2);
                numPistas= numPistas+1;
                points = points - 60;
                MainActivity.setAcertados(aciertos);
                MainActivity.setPuntos(points);
                tv2.setText(msj_puntos);
                mostrarPuntos();

            }else if (numPistas ==0 && points<10){
                MainActivity.setAcertados(aciertos);
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                CharSequence text = "No tienes suficientes puntos para comprar una pista";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                MainActivity.setPuntos(points);



            }else if (numPistas ==1 && points<60){
                MainActivity.setAcertados(aciertos);
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                CharSequence text = "No tienes suficientes puntos para comprar una pista";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                MainActivity.setPuntos(points);

            }



        }

    };
    public void onBackPressed(){
        MainActivity.setAcertados(aciertos);
        MainActivity.setAcertados(aciertos);
        finish();
    }
    public void mostrarPuntos(){
        probar=Integer.toString(points);
        msj_puntos = "Tienes "+probar+" puntos";
        tv2.setText(msj_puntos);
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
