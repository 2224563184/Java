package com.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.contorller"})

public class main  {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(main.class, args);
    }

}
