package com.example.test_aspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestAspectApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(TestAspectApplication.class, args);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Apple apple = (Apple)applicationContext.getBean("apple");
    }

}
