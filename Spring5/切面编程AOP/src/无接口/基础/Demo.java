package 无接口.基础;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("无接口\\iuu.xml");

        User user = context.getBean("user", User.class);
        user.add();

    }
}
