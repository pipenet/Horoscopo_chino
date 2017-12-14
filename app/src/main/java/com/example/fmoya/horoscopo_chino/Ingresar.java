package com.example.fmoya.horoscopo_chino;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ingresar extends AppCompatActivity {

    EditText edtUserI, edtPassI;
    Button btnIngresar, btnModificar;
    String user;
    String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
        edtUserI = (EditText) findViewById(R.id.edtUserI);
        edtPassI = (EditText) findViewById(R.id.edtPassI);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnModificar = (Button) findViewById(R.id.btnModificar);
        user="";
        pass="";

    }

    public void clkIngresar(View v) {

       /* if (edtUserI.getText().toString().equals("pipo") ){
            Intent admin= new Intent(Ingresar.this, Administrador.class);
            startActivity(admin);

            return;
        }*/

        BaseHelper BaseHelper = new BaseHelper(this, "tabla", null, 1);
        SQLiteDatabase db = BaseHelper.getReadableDatabase();
        user = (edtUserI.getText().toString());
        pass = (edtPassI.getText().toString());
        if (db != null) {
            Cursor c = db.rawQuery("select * from USUARIO", null);
            int cantidad = c.getCount();
            int i = 0;
            String[] arreglo = new String[cantidad];
            Toast.makeText(this, user+" "+pass, Toast.LENGTH_LONG).show();

            if (c.moveToFirst()) {

                do {
                    String linea = c.getString(0) + " " + c.getString(1);
                    arreglo[i] = linea;
                    i++;

                    Toast.makeText(this, "clic", Toast.LENGTH_LONG).show();
                    if (linea.equals(user + " " + pass)) {
                        Toast.makeText(this, "Bienvenid@", Toast.LENGTH_LONG).show();

                        setIntent(new Intent());
                        Intent g;
                        g = new Intent(this, PasoHoroscopo.class);
                        startActivity(g);
                       // g.putExtra("nombre", edtUserI.getText().toString());
                        db.close();
                        return;
                    }
                    db.close();
                   // break;


                   getIntent().removeExtra("key");
                    Toast.makeText(this, "Registrate", Toast.LENGTH_SHORT).show();
                    setIntent(new Intent());
                    Intent xyz;
                    xyz = new Intent(this, Registrarse.class);
                    startActivity(xyz);

                } while (c.moveToNext());

                db.close();


            }


        }

    }
}