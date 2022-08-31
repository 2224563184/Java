package itheima.新的业务;

import itheima.Dao.BookDao;
import itheima.domain.Book;
import itheima.新的业务.接口;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TestPlus {
    接口<ArrayList<String>> l;
    @Autowired
    BookDao bookDao;
    public void test()throws Exception{
/*        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List list1 = bookDao.selectBatchIds(list);
        System.out.println("book="+list1);*/

/*        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", 1);
        List<Book> byMap = bookDao.selectByMap(hashMap);
        System.out.println("byMap="+byMap);
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "E");
        wrapper.allEq(map);
        Book book = bookDao.selectOne(wrapper);
        System.out.println("book="+book);*/
 /*       QueryWrapper<Book> wrapper = new QueryWrapper<>();
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "xx");
        wrapper.allEq(map);
        boolean exists = bookDao.exists(wrapper);
        System.out.println("exists="+exists);*/
/*
        Long aLong = bookDao.selectCount(null);
        System.out.println("统计数量="+aLong);*/
//        List<Map<String, Object>> selectMaps = bookDao.selectMaps(null);
//        System.out.println(selectMaps);
/*        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("name", "李四");
        wrapper.allEq(null);
        List<Object> objects = bookDao.selectObjs(wrapper);
        System.out.println("11111111111111111111="+objects);*/
/*
        QueryWrapper<Book> quer=new QueryWrapper<>();
         quer.eq("name", "E");
        bookDao.update(book,null);*/
/*        Collection<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(4);
        bookDao.deleteBatchIds(list);*/
   /*     Map<String, Object> hashMap=new HashMap<>();
        hashMap.put("id", 100);*/
//        hashMap.put("age", 500);
/*        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
         queryWrapper.eq("age", 100);
        bookDao.delete(queryWrapper);*/
//        bookDao.deleteByMap();

//        bookDao.insert(book);
//        bookDao.deleteById(book);
//        bookDao.deleteById(100);
/*        List<Book> list = bookDao.username("张飞");
        System.out.println(list);*/

        Book book = new Book();
        book.setAge(3);
        book.setEmail("xxx");
        book.setName("xxx");
        book.setPassword("xxx");
        book.setUserName("xxx");
        book.setVersion(null);
 /*
    QueryWrapper<Book> quer=new QueryWrapper<>();
        quer.select("uu");
         quer.ge("uu", 50);
        List<Book> list = bookDao.selectList(quer);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
*/

        Map<String, Object> map=new HashMap<>();
            map.put("uu", 1);
        List<Book> byMap1 = bookDao.selectByMap(map);
        List<Book> byMap2= bookDao.selectByMap(map);
//        bookDao.insert(book);
        bookDao.insert(book);
//        System.out.println(byMap1);



    }
}
