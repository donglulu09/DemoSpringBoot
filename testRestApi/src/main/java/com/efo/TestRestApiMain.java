package com.efo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.efo.controller","com.efo.TestRestApiMain.class"})
public class TestRestApiMain {
    public static void main(String[] args) {
        SpringApplication.run(TestRestApiMain.class, args);
    }

}
