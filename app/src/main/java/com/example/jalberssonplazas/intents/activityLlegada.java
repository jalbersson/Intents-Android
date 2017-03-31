package com.example.jalberssonplazas.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class activityLlegada extends AppCompatActivity
{

    TextView txtNombre;
    TextView txtCorreo;
    TextView txtEdad;
    Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llegada);

        txtCorreo=(TextView) findViewById(R.id.txtLLcorreo);
        txtNombre=(TextView) findViewById(R.id.txtLLnombre);
        txtEdad=(TextView) findViewById(R.id.txtLLedad);
        datos=getIntent().getExtras();
        Toast.makeText(this, "sdfsdf", Toast.LENGTH_LONG);

        txtCorreo.setText(datos.getString("correo"));
        txtNombre.setText(datos.getString("nombre"));
        txtEdad.setText(datos.getString("edad"));
    }
}
