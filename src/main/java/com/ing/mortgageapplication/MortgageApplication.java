package com.ing.mortgageapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ing.mortgageapplication")
public class MortgageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MortgageApplication.class, args);
    }

}
