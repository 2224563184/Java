package 反射.配置文件;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
/*
    案例:
      Student s=new Student
              s.study

      Teacher  t =new Teacher
               t.teach

         new...
         ......
    假设在测试类中,只能调用一个类,每次都要换一个类太麻烦了

 */
//ClassName
//methodName
        Properties prop= new Properties();
        FileReader fr=new FileReader("D:\\项目\\模块\\src\\反射\\配置文件\\cl.txt");
//  加载到集合中
        prop.load(fr);
        fr.close();
//        获取class文件
        String className = prop.getProperty("className");
//        获取方法对象
        String methodName = prop.getProperty("methodName");

        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
//        返回方法对象
        Method m = c.getMethod(methodName);
//调用
         m.invoke(obj);




    }
}
