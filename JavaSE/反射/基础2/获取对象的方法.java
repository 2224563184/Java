package 反射.基础2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
获得Class对象后：
1.Constructor<?>[]getConstructors():返回一个包含 Constructor对象的数组            所有变量、方法一个个当作对象
     Constructor对象反映了由该 Class对象表示的类的所有公共(public)构造函数            但只能是公共的

2.Constructor<?>[] getDeclaredConstructors​():返回反映由该 Class对象表             同上，而且全部可用
                       示的类声明的所有构造函数的 Constructor对象的数组

3.Constructor<T> getConstructor​(Class<?>... parameterTypes) 返回一个            只拿一个对象，只能是公共的
         Constructor对象，该对象反映由该 Class对象表示的类的指定公共构造函数

4.Constructor<T> getDeclaredConstructor​(Class<?>... parameterTypes)            只拿一个对象，可以非公共的
 返回一个 Constructor对象，该对象反映由此 Class对象表示的类或接口的指定构造函数
 */
public class 获取对象的方法 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("反射.基础2.Student");
//一、  获取所有公共与所有非公共
        Constructor<?>[] con = c.getDeclaredConstructors();
        for (Constructor s2:con){
            System.out.println(s2);
        }
        Constructor<?>[] cons = c.getConstructors();
         for (Constructor s1:cons){
             System.out.println(s1);
         }

        System.out.println();
//二、 获取指定的
/*
                  getDeclaredConstructor​(Class<?>... parameterTypes)
   Constructor<T> getDeclaredConstructor​(Class<?>... parameterTypes)
   参数：要获取的构造方法中的参数的个数和数据类型对应的字节码文件对象
   T newInstance​(Object... initargs) 使用此 构造器对象表示的构造方法，使用指定的初始化参数创建和初始化构造函数声明类的新实例。
 */
/*
           Studen  obj=new Studen();
           System.out.println(obj);
 */
        Constructor<?> con3 = c.getConstructor();
        Object obj = con3.newInstance();
        System.out.println(obj);
//      此方法与上面的方法效果一致,这里只是用了反射
    }
}
