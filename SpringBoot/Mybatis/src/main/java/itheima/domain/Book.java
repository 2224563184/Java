package itheima.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
@TableName("tb_user")
@Data
public class Book {
 public Book() {
 }
//@TableId(value = "uu",type = IdType.ASSIGN_ID)
@Version
 private Integer  version;
 private Integer uu;
 private String  userName;
 private String  password;
 private String  name;
 private Integer age;
 private String  email;



}
