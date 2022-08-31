package 反射.反射集合;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
// 使用反射可以修改的集合中基本类型
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
//
        Class<? extends List> aClass = list.getClass();
        Method add = aClass.getMethod("add", Object.class);
        Object invoke = add.invoke(list, "r");//int 变成 String
        System.out.println(list);
    }
}
