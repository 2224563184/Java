package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class domain {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(domain.class, args);
        test o = (test)run.getBean("t");
         o.test();

    }
    @Bean
    public  test t(){
        return new test();
    }

}

class  test{
    @Autowired JdbcTemplate jdbcTemplate;
    public void test() {
        String sql = "select * from tb_user";
        List<tbuser> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(tbuser.class));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}