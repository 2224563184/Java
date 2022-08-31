package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication(scanBasePackages = {"com"})
public class boot {
    public static void main(String[] args) {
        ConfigurableApplicationContext boot = SpringApplication.run(boot.class, args);
        System.out.println("499999999999999");
    }
}
