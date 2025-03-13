package com.example.demo1;

import java.util.ArrayList;
import java.util.*;

public abstract class DataBase {
    private static ArrayList<word> all_words = new ArrayList<>();
    private static ArrayList<word> starter_pack = new ArrayList<>();
    private static int UserID=10000;
    private static int pUserID=20000;
    private static ArrayList<PremiumStudent> p_stu = new ArrayList<>();
    private static Map<Student,Integer> stu = new HashMap<>();
    private static Map<PremiumStudent,Integer> pstu = new HashMap<>();




    public static int p_setID(){
        pUserID+=1;
        return pUserID;
    }

    public static int setID() {
        UserID+=1;
        return UserID;
    }

    public static int getUserID(String name) {
        for (Map.Entry<Student,Integer> entry : stu.entrySet()) {
            if (entry.getKey().getUsername().equals(name)) {
                return entry.getValue();
            }
        }
        throw new IllegalArgumentException("Student ID not found for: " + name);
    }

    public static ArrayList<Student> getStudent() {
        ArrayList<Student> students = new ArrayList<>();
        for (Map.Entry<Student,Integer> entry : stu.entrySet()) {
            students.add(entry.getKey());
        }
        return students;
    }
    public static Student getStudent(int id) {
        for (Map.Entry<Student,Integer> entry : stu.entrySet()) {
            if (entry.getValue() == id) {
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("Student not found");
    }
    public static ArrayList<PremiumStudent> getpStudent() {
        ArrayList<PremiumStudent> pstudents = new ArrayList<>();
        for (Map.Entry<PremiumStudent,Integer> entry : pstu.entrySet()) {
            pstudents.add(entry.getKey());
        }
        return pstudents;
    }

    public static void addStudent(String ad, String soyad) {
        int id = setID();
        System.out.println("Student ID: " + id);
        stu.put(new Student(ad, soyad),id);
    }
    public static void addpStudent(String ad, String soyad) {
        int id = p_setID();
        System.out.println("premium Student ID: " + id);
        stu.put(new Student(ad, soyad),id);
    }

    public static ArrayList<word> getAll_words(){
        return all_words;
    }

    public static void addwords(word w1, word w2, word w3, word w4, word w5){
        all_words.add(w1);
        all_words.add(w2);
        all_words.add(w3);
        all_words.add(w4);
        all_words.add(w5);
    }
    public static ArrayList<word> addwords(word w1){
        all_words.add(w1);
        return all_words;
    }






}
