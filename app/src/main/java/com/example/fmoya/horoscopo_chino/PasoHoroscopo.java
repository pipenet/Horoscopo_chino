package com.example.fmoya.horoscopo_chino;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PasoHoroscopo extends AppCompatActivity {
    TextView tvUsuario;
    Button btnHoroscopo, btnModificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso_horoscopo);
       // tvUsuario = (TextView) findViewById(R.id.tvUsuario);
      String nombre = getIntent().getStringExtra("nombre");
        tvUsuario.setText(nombre);
        Toast.makeText(this, "Hola " + nombre, Toast.LENGTH_LONG).show();
        btnHoroscopo = (Button) findViewById(R.id.btnIngresar);
        btnModificar = (Button) findViewById(R.id.btnModificar);
        getIntent().removeExtra("Registrar");

    }

    public void clkModificar(View v) {

        setIntent(new Intent());
        Intent Mod;
        Mod = new Intent(PasoHoroscopo.this , Modificar.class);
        startActivity(Mod);
    }

    public void clkHoroscopo(View v) {
        setIntent(new Intent());
        Intent Po;
        Po = new Intent(PasoHoroscopo.this, Horoscopo.class);
        startActivity(Po);
    }
}