package com.example.fmoya.horoscopo_chino;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registrarse extends AppCompatActivity {
    EditText edtUser,edtPass, edtDia, edtMes, edtAnio;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
        edtUser=(EditText)findViewById(R.id.edtUser);
        edtPass=(EditText)findViewById(R.id.edtPass);
        edtDia=(EditText)findViewById(R.id.edtDia);
        edtMes=(EditText)findViewById(R.id.edtMes);
        edtAnio=(EditText)findViewById(R.id.edtAnio);
        btnGuardar=(Button)findViewById(R.id.btnIngresar);

    }
    public void clkGuardar (View v){
        Guardar (edtUser.getText().toString(),edtPass.getText().toString(),
                edtDia.getText().toString(),edtMes.getText().toString(),edtAnio.getText().toString());
    }

    private void Guardar (String usuario, String password, String dia, String mes, String anio){
        BaseHelper BaseHelper=new BaseHelper(this,"tabla",null,1);
        SQLiteDatabase db=BaseHelper.getWritableDatabase();
        try{
            ContentValues cv=new ContentValues();
            cv.put ("usuario",usuario);
            cv.put ("password",password);
            cv.put ("dia",dia);
            cv.put ("mes",mes);
            cv.put ("anio",anio);
            db.insert("USUARIO",null,cv);
            db.close();
            Toast.makeText(this,"Registrado",Toast.LENGTH_SHORT).show();
            Intent g;
            g = new Intent(this, Ingresar.class);
            startActivity(g);

        }catch (Exception e){
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }
    }


}
