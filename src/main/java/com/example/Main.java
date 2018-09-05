package com.example;

import com.example.service.PropertyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String [] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.*");
        PropertyService ps = (PropertyService) context.getBean("propertyService");
        while(true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ps.getConfig();

        }
    }
}
