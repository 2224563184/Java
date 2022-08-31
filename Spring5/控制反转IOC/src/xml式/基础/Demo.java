package xml式.基础;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import 半注解式.基础.Dao;

public class Demo {
    public static void main(String[] args) {
      ApplicationContext app =
                new ClassPathXmlApplicationContext("xml式/基础/beans.xml");
        studen stu = app.getBean("stu", studen.class);
//        name属性
        System.out.println(stu.getName());
//        age属性
        System.out.println(stu.getAge());
//        数组属性
        System.out.println(stu.getArr()[0]);

//        set集合
        System.out.println(stu.getSet().iterator().next());
//        user对象
        System.out.println(stu.getUser().getAge());
//        list集合
        System.out.println(stu.getArrayList().get(0));
//        map集合
        System.out.println(stu.getHashMap().get("键"));
//        配置集合
        System.out.println(stu.getProperties().get("配置"));
      Dao dao = app.getBean("dao", Dao.class);
      System.out.println(dao);
    }




}
