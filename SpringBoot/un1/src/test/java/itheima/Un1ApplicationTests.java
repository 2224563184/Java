package itheima;

import itheima.Dao.StudentDao;
import itheima.Model.Student;
import itheima.Un1Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Un1Application.class)
class Un1ApplicationTests {
    @Autowired
    StudentDao studentDao;
    @Test
    void contextLoads() {
        Student student = studentDao.selectById();
        System.out.println(student);
        System.out.println(1111);
    }

}
