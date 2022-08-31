package com.example.Validation;


import Model.tbuser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


/*
  MOCK              不启动
  DEFINED_PORT      启动web环境, 指定端口
  RANDOM_PORT       启动web环境, 随机端口
  , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
  @AutoConfigureMockMvc
* */
@SpringBootTest(classes = emo.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
@AutoConfigureMockMvc
class ts {

//
//          @Test
//    void  test(@Autowired MockMvc mockmock)throws Exception{
//              MockHttpServletRequestBuilder mockMv = MockMvcRequestBuilders.get("/books");
//            mockmock.perform(mockMv);
//          }
@Test
    void jdbc(@Autowired  JdbcTemplate jdbcTemplate ){
        String sql = "select * from tb_user";
        List<tbuser> tbusers = jdbcTemplate.queryForList(sql, tbuser.class);
        System.out.println(tbusers);
    }
}
