package org.example;

import static org.junit.Assert.assertTrue;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import itheima.mp.simple.pojo.Dao.test;
import itheima.mp.simple.pojo.model.student;
import itheima.mp.simple.pojo.model.user;
import itheima.mp.simple.pojo.tool.tool;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        SqlSession sqlSession = tool.getsqlSession();
        test mapper = sqlSession.getMapper(test.class);
//        System.out.println(mapper.selectList());
//        List<student> list = mapper.list();
//        System.out.println(list);
//        List<user> users = mapper.selectList();
//        System.out.println(users);
//        System.out.println(mapper.selectById(1));
        List<user> users = mapper.selectList(new QueryWrapper<user>(new user()));
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }

        sqlSession.close();

    }
}
