package com.example.pc.transexpress;



public class ArchiveList {
    String adressDepart;
    String adressArrivee;
    String typeArticle;

    int num;


    public String getAdressDepart() {
        return adressDepart;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArchiveList(String adressDepart, String adressArrivee, String typeArticle, int num) {
        this.adressDepart = adressDepart;
        this.adressArrivee = adressArrivee;
        this.typeArticle = typeArticle;

        this.num = num;
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


}

