package com.example.Validation;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication

public class emo {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(emo.class, args);
        test test =(test) run.getBean(com.example.Validation.test.class);
        System.out.println(test.getAge());
    }
    @Bean
    public  test test(){
        return new test(null,10000);
    }

}
