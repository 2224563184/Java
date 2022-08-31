package xml式.自动装配;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("xml配置\\自动装配\\ang.xml");
        test test = app.getBean("test", test.class);
        System.out.println(test.getUser());

    }
}
