package com.example.jalberssonplazas.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    Button btnContactenos;
    EditText etxtNombre;
    EditText etxtCorreo;
    EditText etxtEdad;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContactenos=(Button) findViewById(R.id.btnContactenos);
        etxtCorreo=(EditText) findViewById(R.id.etxtCorreo);
        etxtNombre=(EditText) findViewById(R.id.etxtNombre);
        etxtEdad=(EditText) findViewById(R.id.etxtEdad);

        btnContactenos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this, activityLlegada.class);
                intent.putExtra("nombre", etxtNombre.getText());
                intent.putExtra("correo", etxtCorreo.getText());
                intent.putExtra("edad", etxtEdad.getText());
                startActivity(intent);
            }
        });
    }
}
