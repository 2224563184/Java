package 纯注解式.基础;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"纯注解式.基础"})
public class intdx {

    @Bean
    public Student student(){
        Student student = new Student();
        student.setName("小简简");
        student.setAge(10);
        return student;
    }

}
