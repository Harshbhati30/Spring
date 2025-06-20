package com.harsh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class SpringBotDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringBotDemoApplication.class, args);

		Alien obj=context.getBean(Alien.class);
		obj.code();

	}


}
