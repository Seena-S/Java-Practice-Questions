package com.demo.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        Inmakes in=context.getBean(Inmakes.class);
//        in.displayCourses();
          in.displayCourses("Java");
//        in.displaySecurity();
//        in.transaction("Python");
          in.amount(200);
    }
}
