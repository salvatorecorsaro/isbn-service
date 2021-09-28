package com.bookapp.isbnservice;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/isbn")
public class IsbnController {

    public IsbnController(Faker faker) {
        this.faker = faker;
    }

    final private Faker faker;


    @GetMapping
    public String generateIsbn(){
        return faker.code().isbn10();
    }
}
