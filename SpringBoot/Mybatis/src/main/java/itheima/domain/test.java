package itheima.domain;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import itheima.Dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@SuppressWarnings("all")
public class test {
    @Autowired
    BookDao bookDao;
    public  void  tets(){

/*      调用自定义的数据库函数
        List<Book> list = bookDao.username();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/

/*      调用 BaseMapper接口的函数
        List<Book> books = bookDao.selectList(new QueryWrapper<Book>());
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }*/
//        分页查询
        Page<Book> page = new Page<Book>(1,5);
        Page<Book> bookPage = bookDao.selectPage(page, new QueryWrapper<Book>());
        System.out.println(bookPage);


    }
}
