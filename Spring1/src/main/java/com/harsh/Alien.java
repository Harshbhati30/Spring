package com.harsh;

import java.sql.SQLOutput;

public class Alien {
    private int age;
    private Computer comp;


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding0...");
        comp.compile();
    }
}
