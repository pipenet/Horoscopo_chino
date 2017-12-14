package com.example.fmoya.horoscopo_chino;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Login extends AppCompatActivity {
    Button btnIngresar;
    Button btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnRegistrar = (Button) findViewById(R.id.btnRegistrar);
    }
    public void clkIngresar (View v){






        Intent i=new Intent (this,Ingresar.class);
        startActivity(i);
    }
    public void clkRegistrar (View v){
        Intent i=new Intent (this,Registrarse.class);
        startActivity(i);
    }
}
