package 纯注解式.基础;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(intdx.class);
        Student student = (Student) app.getBean("student");
        System.out.println(student);
    }

}
