package com.example.test_mix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"spring-common.xml"})
public class TestMixApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(TestMixApplication.class, args);
    }

}
