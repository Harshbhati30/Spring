package com.harsh;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Laptop implements Computer {

    @Override
    public void compile(){
        System.out.println("Compiling Using Laptop");
    }
}
