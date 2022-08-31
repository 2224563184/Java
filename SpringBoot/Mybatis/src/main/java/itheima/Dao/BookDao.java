package itheima.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import itheima.domain.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//@TableName("mp.tb_user")

public interface BookDao  extends BaseMapper<Book>  {
    @Select("select *  from tb_user where name=#{name}    ")
    List<Book> username(String name);
//
//    @Override
//    @Select("select  * from  student  where id=#{id}")
//    Book selectById(Serializable id);
}
