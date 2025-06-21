package com.harsh;

import java.sql.SQLOutput;

public class Alien {
    private int age;
    private Laptop lap1;

    public Alien(int age, Laptop lap1) {
        this.age = age;
        this.lap1 = lap1;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Laptop getLap1() {
        return lap1;
    }
    public void setLap1(Laptop lap1) {
        this.lap1 = lap1;
    }


    public void code(){
        System.out.println("Coding0...");
        lap1.compile();
    }
}
