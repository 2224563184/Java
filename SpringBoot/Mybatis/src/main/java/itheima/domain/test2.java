package itheima.domain;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import itheima.Dao.BookDao;
import itheima.Dao.IBookService;
import org.springframework.beans.factory.annotation.Autowired;

public class test2 extends ServiceImpl<BookDao, Book> implements IBookService {
    @Autowired
    private IBookService ibookService;

//    调用开发数据的接口
    public  void  test2(){

    }
}
