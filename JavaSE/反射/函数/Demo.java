package 反射.函数;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Class<?> c = Class.forName("反射.函数.Student");      //获取Class文件
        Constructor<?> con = c.getConstructor();             //获取构造器对象
        Student obj = (Student) con.newInstance();            //通过构造器对象创建指定对象
        Method fun = c.getDeclaredMethod("function");  // 获取函数对象
         fun.setAccessible(true);                            //暴力反射
        Object invoke = fun.invoke(obj);                     //函数调用, 接收返回值
//           参数1: 指定对象
//           参数2: 形参赋值
        System.out.println(invoke);


    }
}
