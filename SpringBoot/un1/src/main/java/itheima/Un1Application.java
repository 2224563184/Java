package itheima;

import itheima.Dao.test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"itheima"})
public class Un1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Un1Application.class, args);

        Object test = run.getBean("test");
        System.out.println(test);
    }
    @Bean
    public test test(){
        return  new test();
    }
}





