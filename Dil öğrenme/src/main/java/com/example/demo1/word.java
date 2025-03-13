package com.example.demo1;

import java.util.ArrayList;

public class word {
private int point = 0;
private String turkish;
private String english;
private String Ipa;

    public word(String turkish, String english) {
        this.turkish = turkish;
        this.english = english;
        this.Ipa = " ";
    }
    public word(String turkish,String english, String Ipa){
        this.turkish = turkish;
        this.english = english;
        this.Ipa = Ipa;
    }
    public void addToPoint(){
        point++;
    }

    public void decreasePoint(){
        point--;
    }

    public String getIpa() {
        return Ipa;
    }

    public String getTurkish() {
        return turkish;
    }

    public String getEnglish() {
        return english;
    }

    public int getPoint() {
        return point;
    }
}
