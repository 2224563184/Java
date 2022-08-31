package 数据库;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class 查询 {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("and.xml");
        JdbcTemplate jdbc = applicationContext.getBean("jdbc", JdbcTemplate.class);
        String sql="select * from user where user =? ";

//查询:        单个 - 一行 - 全行
        String str = jdbc.queryForObject(sql, String.class);
        tem tem = jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(tem.class),"222");
        List<tem> query = jdbc.query(sql, new BeanPropertyRowMapper<>(tem.class), "222");



    }


    }

