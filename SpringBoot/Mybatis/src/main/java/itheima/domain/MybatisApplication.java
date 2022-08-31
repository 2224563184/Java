package itheima.domain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"itheima"})
@MapperScan("itheima.Dao")
public class MybatisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MybatisApplication.class, args);
/*        test test = (test)run.getBean("test");
        test.tets();*/
        test2 test2 =(test2) run.getBean("test2");
        test2.test2();
    }

    @Bean
public  test test(){
        return  new test();
}

    @Bean
public  test2 test2(){return new test2();}


}
