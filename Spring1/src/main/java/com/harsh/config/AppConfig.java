package com.harsh.config;

import com.harsh.Alien;
import com.harsh.Computer;
import com.harsh.Desktop;
import com.harsh.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.harsh")
public class AppConfig {

//    @Bean(name ="desktop")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(Computer comp){
//        return new Laptop();
//    }
//
//    @Bean
//    public Alien alien(Computer comp){
//        Alien obj=new Alien();
//        obj.setAge(32);
//        obj.setComp(comp);
//        return obj;
//    }
}
