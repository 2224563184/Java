package 有接口.基础;

import 有接口.基础.StuDent;

import java.lang.reflect.Proxy;

public class as {
    public static void main(String[] args) throws Throwable {
        Class[] classes=new Class [1];
        classes[0]=Dao.class;

        Class[] and={Dao.class};

        Dao aop =(Dao) Proxy.newProxyInstance(as.class.getClassLoader(), classes, new StuDent(new User()));

          aop.add();
//          aop.op();


    }

}
