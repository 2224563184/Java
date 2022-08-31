package com;

import com.Data.test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.Data","com"})
@MapperScan("com.Data")
public class EsApplication {

    public static void main(String[] args)throws Exception {
        ConfigurableApplicationContext bootIOC = SpringApplication.run(EsApplication.class, args);
        test test = bootIOC.getBean(test.class);
        test.test();
    }

}
