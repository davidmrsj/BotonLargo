package com.example.botonlargo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener, View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miBoton = (Button) findViewById(R.id.boton);
        miBoton.setOnLongClickListener(this);
        miBoton.setOnClickListener(this);

    }

    @Override
    public boolean onLongClick(View v) {
        TextView entradaTexto;
        TextView salidaTexto;

        entradaTexto = (TextView) findViewById(R.id.entradaTexto);
        salidaTexto = (TextView) findViewById(R.id.salidaTexto);
        salidaTexto.setText("Adios " + entradaTexto.getText());
        return true;
    }

    @Override
    public void onClick(View v) {
        TextView entradaTexto;
        TextView salidaTexto;

        entradaTexto = (TextView) findViewById(R.id.entradaTexto);
        salidaTexto = (TextView) findViewById(R.id.salidaTexto);
        salidaTexto.setText("Hola " + entradaTexto.getText());
    }
}