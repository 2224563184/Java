package itheima.mp.simple.pojo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@TableName("tb_user")
@Data
public class student {
    private  String name;
    private Integer age;
    private Integer tid;
    private Integer id;
}
