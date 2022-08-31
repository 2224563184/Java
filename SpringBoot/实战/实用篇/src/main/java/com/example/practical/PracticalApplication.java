package com.example.practical;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.Duration;

//@SpringBootApplication
public class PracticalApplication {
       Duration duration=   Duration.ofDays(4);

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(PracticalApplication.class, args);

        Dataa dataa =(Dataa) run.getBean("dataa");
//        dataa.test();
        System.out.println(dataa.getduration());

    }
    @Bean
    public Duration duration(){
        return  duration;
    }


}
