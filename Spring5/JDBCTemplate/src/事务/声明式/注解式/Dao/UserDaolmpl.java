package 事务.声明式.注解式.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service(value = "userDaolmpl")

public class UserDaolmpl implements UserDao{
@Autowired
    private JdbcTemplate jdbcTemplate;


    public UserDaolmpl() {

    }

    public void add() {

        String sql2="update  user set pass=? where user=?";
        jdbcTemplate.update(sql2,"9","id");
        int[] ints = {};
        ints[20]=10;     //制造异常
    }

    public void redu() {
        String sql="update  user set pass= ? where user=?";
        jdbcTemplate.update(sql,"" + "9" +
                "1000","name");
    }



}
