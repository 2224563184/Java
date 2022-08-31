package 事务.声明式.注解式.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import 事务.声明式.注解式.Service.UserService;

@Service(value = "testBook")
public class TestBook {

    public static void main(String[] args) {
//        获取容器
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("事务\\声明式\\and.xml");
//        获取容器指定的对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.and();
    }

}
