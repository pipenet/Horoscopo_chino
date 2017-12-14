package com.example.fmoya.horoscopo_chino;

/**
 * Created by fmoya on 11-12-2017.
 */

public class Signo {

    private String sign;
    private String legend;
    private String element;
    private String year;

    public Signo(String sign, String legend, String element, String year) {
        this.sign = sign;
        this.legend = legend;
        this.element = element;
        this.year = year;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getLegend() {
        return legend;
    }

    public void setLegend(String legend) {
        this.legend = legend;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
