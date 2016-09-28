package com.aledroid.pinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Configurar extends AppCompatActivity implements View.OnClickListener {

    private Button buttonEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurar);

        buttonEditar = (Button)findViewById(R.id.button2);

        Bundle parametros = getIntent().getExtras();
        String nombreCompleto = parametros.getString("nombre");
        String correo = parametros.getString("email");
        String celular = parametros.getString("telefono");
        String description = parametros.getString("descripcion");
        String fechaNac = parametros.getString("fecha");

        TextView nombre = (TextView)findViewById(R.id.nombre2);
        TextView email = (TextView)findViewById(R.id.email2);
        TextView telefono = (TextView)findViewById(R.id.telefono2);
        TextView descripcion = (TextView)findViewById(R.id.descripcion2);
        TextView fecha = (TextView)findViewById(R.id.fecha2);

        nombre.setText(nombreCompleto);
        email.setText(correo);
        telefono.setText(celular);
        descripcion.setText(description);
        fecha.setText(fechaNac);

        buttonEditar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        onBackPressed();
    }
}
