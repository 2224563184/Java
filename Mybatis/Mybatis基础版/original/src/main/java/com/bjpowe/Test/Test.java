package com.bjpowe.Test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
     SqlSession sqlSession;
public Test(){
       String resource = "SqlMapConfig.xml";
       InputStream inputStream = null;
       try {
           inputStream = Resources.getResourceAsStream(resource);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
       sqlSession = sqlSessionFactory.openSession();
   }
   public    void getEng(){
       sqlSession.close();
   }

    public static void main(String[] args)throws Exception {
/*
* 读取配置
* 创建对象
* ...
* 关闭资源*/
        Test test = new Test();
        List<User> list = test.sqlSession.selectList("name");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        test.getEng();

    }
}
