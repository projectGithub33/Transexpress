package com.example.pc.transexpress;

public class SuiviService {
    String adressDepart;
    String adressArrivee;
    String typeArticle;
    String etatTransfert;


    public String getAdressDepart() {
        return adressDepart;
    }

    public SuiviService(String adressDepart, String adressArrivee, String typeArticle, String etatTransfert) {
        this.adressDepart = adressDepart;
        this.adressArrivee = adressArrivee;
        this.typeArticle = typeArticle;
        this.etatTransfert = etatTransfert;
    }

    public void setAdressDepart(String adressDepart) {
        this.adressDepart = adressDepart;
    }

    public String getAdressArrivee() {
        return adressArrivee;
    }

    public void setAdressArrivee(String adressArrivee) {
        this.adressArrivee = adressArrivee;
    }

    public String getTypeArticle() {
        return typeArticle;
    }

    public void setTypeArticle(String typeArticle) {
        this.typeArticle = typeArticle;
    }

    public String getEtatTransfert() {
        return etatTransfert;
    }

    public void setEtatTransfert(String etatTransfert) {
        this.etatTransfert = etatTransfert;
    }
}
