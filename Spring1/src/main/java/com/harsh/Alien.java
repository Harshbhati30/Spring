package com.harsh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Alien {

    @Value("26")
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

    @Autowired
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding0...");
        comp.compile();
    }
}
