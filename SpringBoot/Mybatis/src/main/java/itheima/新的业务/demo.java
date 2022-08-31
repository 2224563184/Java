package itheima.新的业务;


import org.mockito.internal.util.StringUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "itheima")
@MapperScan("itheima")
public class demo {
    public static void main(String[] args)throws Exception {
        ConfigurableApplicationContext bootIOC = SpringApplication.run(demo.class, args);
        LambdaTest lambdaTest = bootIOC.getBean(LambdaTest.class);
        lambdaTest.test();

    }
}
