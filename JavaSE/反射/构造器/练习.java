package 反射.构造器;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 练习 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Class<?> c = Class.forName("反射.构造器.Stud");
/*
调用的方法:
          private Student(String name){
              this.name=name;
    }
 */
        Constructor<?> con = c.getDeclaredConstructor(String.class);
//暴力反射:void setAccessible​(boolean flag) 将此反射对象的 accessible标志设置为指示的布尔值
        con.setAccessible(true);
        Object obj = con.newInstance("林青霞");
        System.out.println(obj);



    }
}
