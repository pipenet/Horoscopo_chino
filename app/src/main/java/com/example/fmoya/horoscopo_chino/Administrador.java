package com.example.fmoya.horoscopo_chino;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Administrador extends AppCompatActivity {
    EditText edtSign,edtLegend, edtElement, edtYear;
    Button btnAgregar;
    Button btnModificar;
    Button btnListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
        edtSign=(EditText)findViewById(R.id.edtSign);
        edtLegend=(EditText)findViewById(R.id.edtLegend);
        edtElement=(EditText)findViewById(R.id.edtElement);
        edtYear=(EditText)findViewById(R.id.edtYear);
        btnAgregar=(Button)findViewById(R.id.btnAgregar);
        btnModificar=(Button)findViewById(R.id.btnModificar);
        btnListar=(Button)findViewById(R.id.btnListar);

    }
    public void clkGuardar (View v){
        Guardar (edtSign.getText().toString(),edtLegend.getText().toString(),
                edtElement.getText().toString(),edtYear.getText().toString());
    }

    private void Guardar (String signum, String legend, String element, String year){
        BaseHelper helper=new BaseHelper(this,"signum",null,1);
        SQLiteDatabase db=helper.getWritableDatabase();
        try{
            ContentValues cv=new ContentValues();
            cv.put ("signum",signum);
            cv.put ("legend",legend);
            cv.put ("element",element);
            cv.put ("year",year);
            db.insert("SIGNI",null,cv);
            db.close();
            Toast.makeText(this,"Registrado",Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }
    }
    public void clkModificar (View v){
        Modificar (edtSign.getText().toString(),edtLegend.getText().toString(),
                edtElement.getText().toString(),edtYear.getText().toString());
    }

    private void Modificar (String signum, String legend, String element, String year){
        BaseHelper helper=new BaseHelper(this,"signum",null,1);
        SQLiteDatabase db=helper.getWritableDatabase();
        try{
            ContentValues cv=new ContentValues();
            cv.put ("signum",signum);
            cv.put ("legend",legend);
            cv.put ("element",element);
            cv.put ("year",year);
            db.update("SIGNI",cv, "signum", null);
            db.close();
            Toast.makeText(this,"Modificado",Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }
    }
private void Listar (){}

}