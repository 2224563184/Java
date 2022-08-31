package 半注解式.基础;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class user {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("半注解式/基础/bean.xml");
        Dao dao = context.getBean("dao", Dao.class);
        System.out.println(dao.student);
    }
}
