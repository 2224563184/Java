import Levelcache1.Dao.StudentMapper;
import Levelcache1.popj.MybatisUtility;
import Levelcache1.popj.Student;
import Levelcache1.popj.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class TestUser {
    @Test
    public  void  testUser(){
        SqlSession factory = MybatisUtility.getFactory();
        StudentMapper studentMapper = factory.getMapper(StudentMapper.class);
        List<Student> student = studentMapper.getStudent();
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }
    }
}
