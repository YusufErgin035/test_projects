package com.example.demo1;

import java.util.ArrayList;

public abstract class Students {
    private int ID;
    private ArrayList<word> my_list = new ArrayList<>();

    private ArrayList<word> ve_learned = new ArrayList<>();

    private String Username;

    private String Password;

    Students(String username, String password  ) {
        for (int i=0;i < 8;i++){
            isfirst[i]=true;
        }

        try {
            this.ID = DataBase.getUserID(this.Username);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        this.Username = username;
        this.Password = password;
    }
    public int getID(){
        return this.ID;
    }
    public String getUsername(){
        return Username;
    }

    public String getPassword(){
        return Password;
    };

    boolean[] isfirst = new boolean[8];

    void  add_mylist(word w1){

        my_list.add(w1);

    };
    void add_mylist(word w1,word w2,word w3,word w4,word w5){
        my_list.add(w1);
        my_list.add(w2);
        my_list.add(w3);
        my_list.add(w4);
        my_list.add(w5);
    };
    public ArrayList<word> getVe_learned(){

        return ve_learned;

    };
    public ArrayList<word> get_mylist(){

        return my_list;

    };
    public word get_myWord(word w){

        for(word w1:my_list){
            if(w1.equals(w)){
                return w1;
            }
        }
        throw new IllegalArgumentException("word not found: " + w);
    };
    void pop_mylist(word w1){

        my_list.remove(w1);
    };
    public boolean getIsFirst(int index){
        return isfirst[index];
    };
    public void SetIsfirst(int index,boolean sonuc){
        isfirst[index] = sonuc;
    };
}
