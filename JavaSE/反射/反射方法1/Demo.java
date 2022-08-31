package 反射.反射方法1;

import 反射.反射属性.Stud;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Stud> c = Stud.class;
        Constructor<Stud> con = c.getDeclaredConstructor();
        Stud obj = con.newInstance();

        Method fun = c.getDeclaredMethod("function");
         fun.setAccessible(true);
        Object invoke = fun.invoke(obj);
        System.out.println(invoke);


    }
}
