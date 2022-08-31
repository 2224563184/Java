package itheima.Dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.service.IService;
import itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
@TableName("mp.tb_user")
@Mapper

public interface IBookService extends IService<Book> {

}
