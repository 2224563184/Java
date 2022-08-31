package 事务.声明式.XML式;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demo {

    public void or(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("事务\\声明式\\xml式\\and.xml");

//        jdbc对象
        JdbcTemplate jdbcTemplate = context.getBean("springjdbc", JdbcTemplate.class);
        jdbcTemplate.update("update user set  pass=? where USER =?","700","id");
        int[] ints = new int[1];
//        ints[5]=4; //过界异常
        jdbcTemplate.update("update user set  pass=? where USER =?","700","name");
    }



}
