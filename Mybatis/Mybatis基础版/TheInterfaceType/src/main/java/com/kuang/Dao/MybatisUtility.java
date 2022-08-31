package com.kuang.Dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtility {
 private  static    SqlSessionFactory Connection;
    static {
        try {
            InputStream in = Resources.getResourceAsStream("MappUsers.xml");
            Connection = new SqlSessionFactoryBuilder().build(in);

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public SqlSession getConnection(){
        return Connection.openSession();
    }
}
