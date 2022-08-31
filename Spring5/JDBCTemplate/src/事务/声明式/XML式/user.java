package 事务.声明式.XML式;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class user {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("事务\\声明式\\XML式\\and.xml");
        Demo demo = context.getBean("demo", Demo.class);
        demo.or();

    }
}
