package com.harsh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  //With this line we created the container and in double qotes it has containers configuration file address
        Alien a= (Alien) context.getBean("alien");
        a.age=21;
        System.out.println(a.age);
//        a.code();

        Alien a1= (Alien) context.getBean("alien");
        System.out.println(a1.age);
//        a1.code();

        Laptop l= (Laptop) context.getBean("laptop");
        l.compile();
    }
}
