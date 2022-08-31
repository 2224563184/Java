package com;

import com.redis.redis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.redis"})
public class test {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(test.class, args);
        redis bean = ioc.getBean(redis.class);
        bean.test();

    }

}
