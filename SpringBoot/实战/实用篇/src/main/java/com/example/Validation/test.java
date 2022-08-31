package com.example.Validation;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
@Data
@Validated
//@ConfigurationProperties(prefix = "student")
//@Component
public class test {

    private  String name;
    @Max(value = 10,message = "超出范围")
    private  Integer age;

    public test(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
