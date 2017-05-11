package com.company;

/**
 * Created by Daniel's on 10-05-2017.
 */
public class product {


    private int faktura;
    private int dato;
    private int kundenr;
    private int debitor;
    private String navn;
    private String adresse;
    private double beløb;

    public product(){
        this.faktura = 0;
        this.dato = 0;
        this.kundenr = 0;
        this.debitor = 0;
        this.navn = "";
        this.adresse = "";
        this.beløb = 0;

    }

    public product(int faktura, int dato, int kundenr, int debitor, String navn, String adresse, double beløb){

        this.faktura = faktura;
        this.dato = dato;
        this.kundenr = kundenr;
        this.debitor = debitor;
        this.navn = navn;
        this.adresse = adresse;
        this.beløb = beløb;

    }

    public int getFaktura() {
        return faktura;
    }

    public void setFaktura(int faktura) {
        this.faktura = faktura;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getKundenr() {
        return kundenr;
    }

    public void setKundenr(int kundenr) {
        this.kundenr = kundenr;
    }

    public int getDebitor() {
        return debitor;
    }

    public void setDebitor(int debitor) {
        this.debitor = debitor;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getBeløb() {
        return beløb;
    }

    public void setBeløb(double beløb) {
        this.beløb = beløb;
    }

}

