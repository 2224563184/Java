package com.Data;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@TableName("tb_user")
@Data
public class Student  {
    private        String       user_name     ;
    private        String       password      ;
    private        String       name          ;
    private        Integer       age             ;
    private        String       email         ;
    private        Long          id      ;

}
