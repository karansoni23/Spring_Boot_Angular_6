package com.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.Hello")
public class SpringBootJSPApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJSPApplication.class, args);
    }
}
