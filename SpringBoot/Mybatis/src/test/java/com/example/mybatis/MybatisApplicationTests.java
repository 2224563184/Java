package com.example.mybatis;

import itheima.Dao.BookDao;
import itheima.domain.Book;
import itheima.domain.MybatisApplication;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = MybatisApplication.class)
class MybatisApplicationTests {

    @Autowired
 private BookDao bookDao;

    @Test
    void contextLoads() {

    }

}
