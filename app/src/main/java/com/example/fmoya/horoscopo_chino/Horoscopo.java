package com.example.fmoya.horoscopo_chino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Horoscopo extends AppCompatActivity {
Button Salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscopo);
    }
    public void clkSalir(View v) {

            Intent admin= new Intent(Horoscopo.this,Ingresar.class);
            startActivity(admin);
            finishAfterTransition();
    }
}

