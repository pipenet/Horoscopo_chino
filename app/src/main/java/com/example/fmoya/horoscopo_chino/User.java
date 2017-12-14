package com.example.fmoya.horoscopo_chino;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fmoya on 09-12-2017.
 */

public class User implements Parcelable {
    private String nombre;
    private String password;
    private String dia;
    private String mes;
    private String anio;


    public User(String nombre, String password, String dia, String mes, String anio) {
        this.nombre = nombre;
        this.password = password;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }



    protected User(Parcel in) {
        nombre = in.readString();
        password = in.readString();
        dia = in.readString();
        mes = in.readString();
        anio = in.readString();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(password);
        dest.writeString(dia);
        dest.writeString(mes);
        dest.writeString(anio);

    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}