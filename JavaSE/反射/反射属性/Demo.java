package 反射.反射属性;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Stud> c = Stud.class;
        Field address = c.getField("address");
        Constructor<Stud> con = c.getConstructor();//获取无参构造
        Stud obj = con.newInstance();//把无参构造变成一个对象
        address.set(obj,"林青霞");    //给无参构造的变量赋值

        System.out.println(obj);
    }

}
