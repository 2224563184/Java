package itheima.mp.simple.pojo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import sun.rmi.runtime.Log;

import java.math.BigInteger;
@TableName("tb_user")
@Data
public class user {
    private Long id;
    private String user_name;
    private String password;
    private String name;
    private Integer age;
    private String email;

    public user() {
    }

    public user(Long id, String user_name, String password, String name, Integer age, String email) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
