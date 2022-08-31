package itheima.Dao;

import itheima.Model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

// 创建该接口的代理对象


@Mapper
public interface StudentDao {
    @Select("select * from student")
    Student selectById();
}
