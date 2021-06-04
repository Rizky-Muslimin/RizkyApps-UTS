package com.example.myselfapps;
//Nama : Rizky Muslimin
//NIM : 10118002
//Kelas : IF-1
class MainModel {
    Integer langLogo;
    String langTxt;
    public MainModel(Integer langLogo, String langTxt){
        this.langLogo = langLogo;
        this.langTxt = langTxt;
    }

    public Integer getLangLogo(){
        return langLogo;
    }

    public String getLangTxt() {
        return langTxt;
    }

}
