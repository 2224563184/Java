package itheima.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

@Data
@TableName("lambda")
public class Lambda {
    @Version
    private Integer version;
    private  String name;
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Integer id;

    public Lambda(Integer version, String name, Integer id) {
        this.version = version;
        this.name = name;
        this.id = id;
    }
}
