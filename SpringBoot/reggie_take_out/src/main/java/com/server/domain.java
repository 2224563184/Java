package com.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages ="com")
@MapperScan("com")
public class domain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(domain.class, args);

    }
}
