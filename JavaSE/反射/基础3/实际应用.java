package 反射.基础3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 实际应用 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("反射.基础3.Student");
/*调用该构造方法:
public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }*/
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);


//赋值:
        Object obj = con.newInstance("林青霞", 30, "西安");
        System.out.println(obj);

    }
}
