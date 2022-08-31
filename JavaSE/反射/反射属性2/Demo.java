package 反射.反射属性2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Student> c = Student.class;//              获取Class文件码
        Constructor<Student> con = c.getConstructor();  // 获取构造器
        Student obj = con.newInstance();                        //使用构造器生成对象

        Field name = c.getDeclaredField("name");  //获取属性
                name.setAccessible(true);                             //暴力获取
                name.set(obj,"林青霞");                                //给对象的参数变量     属性.set对象/参数



        Field age = c.getDeclaredField("age");   //同上
              age.setAccessible(true);
              age.set(obj,30);

        Field add = c.getDeclaredField("add");   //同上
              add.setAccessible(true);
              add.set(obj,"西安");

        System.out.println(obj);
        System.out.println(obj);

    }
}
