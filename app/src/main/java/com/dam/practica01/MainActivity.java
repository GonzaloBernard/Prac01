package com.dam.practica01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button boton = findViewById(R.id.buttonCalcular);
        final TextView textView5 = findViewById(R.id.textView5);


        final EditText editText1 = findViewById(R.id.editText1);
        final EditText editText2 = findViewById(R.id.editText2);
        final EditText editText3 = findViewById(R.id.editText3);

        boton.setOnClickListener( new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if(editText1.getText().length()>0 && editText2.getText().length()>0 && editText3.getText().length()>0) {


                    Float montoInicial = (Float) Float.parseFloat(editText1.getText().toString());
                    Integer tasaInteres = (Integer) Integer.parseInt(editText2.getText().toString());
                    Integer meses = (Integer) Integer.parseInt(editText3.getText().toString());
                    //DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    Float aux = (1f + (tasaInteres / 1200f));
                    Double resultado = montoInicial * Math.pow(aux, meses);
                    Long resultado1 = Math.round(resultado * 100);
                    Float resultado2 = resultado1 / 100f;
                    textView5.setText(resultado2.toString());
                }
               else
                    textView5.setText(R.string.string_error);
            }
        });


    }
}
