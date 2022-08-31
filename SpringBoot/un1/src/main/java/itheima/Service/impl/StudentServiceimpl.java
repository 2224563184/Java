package itheima.Service.impl;

import itheima.Dao.StudentDao;
import itheima.Model.Student;
import itheima.Service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceimpl implements StudentService {

    private StudentDao studentDao;

    @Override
    public Student queryStudent() {
        Student student = studentDao.selectById();
        return student;
    }
}
