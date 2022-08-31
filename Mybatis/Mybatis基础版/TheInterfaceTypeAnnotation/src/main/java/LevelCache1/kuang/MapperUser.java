package LevelCache1.kuang;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MapperUser {
    @Select("select * from users ")
    List<Users>  getList();
    @Select("select * from users where id=#{id}")
    Users     getUsers(@Param("id") int id);

}
