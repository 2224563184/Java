package itheima.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



public class test {

    @Autowired
    StudentDao studentDao;
    public  void  testTest(){
        System.out.println(studentDao.selectById());
    }
}
