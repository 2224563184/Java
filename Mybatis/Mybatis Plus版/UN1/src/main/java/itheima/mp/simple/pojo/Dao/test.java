package itheima.mp.simple.pojo.Dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import itheima.mp.simple.pojo.model.student;
import itheima.mp.simple.pojo.model.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//@TableName("tb_user")
@Mapper
public interface test extends BaseMapper<user> {
    @Select("select * from mp.tb_user")
    List<user> selectList();

//    @Select("select * from bjpowernode.student")
    List<student> list();
}
