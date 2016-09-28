package com.aledroid.pinfo;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button     button;
    private TextInputEditText nombre, telefono, email, descripcion;
    private DatePicker fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button      = (Button)findViewById(R.id.button);
        nombre      = (TextInputEditText)findViewById(R.id.Nombre2);
        telefono    = (TextInputEditText)findViewById(R.id.Telefono2);
        email       = (TextInputEditText)findViewById(R.id.Email2);
        descripcion = (TextInputEditText)findViewById(R.id.Descripcion2);
        fecha       = (DatePicker)findViewById(R.id.Fecha);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int day = fecha.getDayOfMonth();
        int month = fecha.getMonth();
        int year =  fecha.getYear();

        Intent i = new Intent(MainActivity.this, Configurar.class);
        i.putExtra("nombre", nombre.getText().toString());
        i.putExtra("email", email.getText().toString());
        i.putExtra("telefono", telefono.getText().toString());
        i.putExtra("descripcion", descripcion.getText().toString());
        i.putExtra("fecha", day+"/"+month+"/"+year);

        startActivity(i);
    }
}
