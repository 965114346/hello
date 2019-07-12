package com.zyy.spring.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HelloApplication.class);
    }

    @GetMapping("/say")
    public String say() {
        return "Hello! Springboot war??????????";
    }
}
