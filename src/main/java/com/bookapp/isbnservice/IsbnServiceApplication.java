package com.bookapp.isbnservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IsbnServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IsbnServiceApplication.class, args);
    }

}
