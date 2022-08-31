package 反射.属性;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Stud> c = Stud.class;                  //获取class文件
        Field address = c.getField("address"); //获取属性对象
        Constructor<Stud> con = c.getConstructor();  //获取构造器对象
        Stud obj = con.newInstance();               //通过构造器对象,创建指定对象
        address.set(obj,"林青霞");                   //属性对象赋值

        System.out.println(obj.address);
    }

}
