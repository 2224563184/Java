package 数据库;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.ArrayList;

public class 增删改 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("and.xml");
        JdbcTemplate jdbc = context.getBean("jdbc", JdbcTemplate.class);
        ArrayList<Object []> list = new ArrayList<>();
        String [] arr={"aaa","ccc"};
        String [] arr2={"aaa","ccc"};
        String [] arr3={"aaa","ccc"};
        list.add(arr);
        list.add(arr2);
        list.add(arr3);

        String sql="insert user values(?,?)";
        jdbc.batchUpdate(sql,list);
    }
}
