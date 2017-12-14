package com.example.fmoya.horoscopo_chino;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Modificar extends AppCompatActivity {
    EditText edtUser,edtPass, edtDia, edtMes, edtAnio;
    Button btnModificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
        edtUser=(EditText)findViewById(R.id.edtUser);
        edtPass=(EditText)findViewById(R.id.edtPass);
        edtDia=(EditText)findViewById(R.id.edtDia);
        edtMes=(EditText)findViewById(R.id.edtMes);
        edtAnio=(EditText)findViewById(R.id.edtAnio);

        btnModificar=(Button)findViewById(R.id.btnModificar);

    }
    public void clkModificar (View v){
        Modificar (edtUser.getText().toString(),edtPass.getText().toString(),
                edtDia.getText().toString(),edtMes.getText().toString(),edtAnio.getText().toString());
    }

    private void Modificar (String usuario, String password, String dia, String mes, String anio){
        BaseHelper helper=new BaseHelper(this,"tabla",null,1);
        SQLiteDatabase db=helper.getWritableDatabase();
        try{
            ContentValues cv=new ContentValues();
            cv.put ("usuario",usuario);
            cv.put ("password",password);
            cv.put ("dia",dia);
            cv.put ("mes",mes);
            cv.put ("anio",anio);
            db.update("USUARIO",cv, "usuario", null);
            db.close();
            Toast.makeText(this,"Modificado",Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }
    }
    public void clkBorrar (View v) {
        Borrar (edtUser.getText().toString());
    }
    private void Borrar (String usuario){
        BaseHelper helper=new BaseHelper(this,"tabla",null,1);
        SQLiteDatabase db=helper.getWritableDatabase();
        try{
            db.delete("USUARIO",usuario,null);
            db.close();
            Toast.makeText(this,"Borrado",Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }
    }

      }
