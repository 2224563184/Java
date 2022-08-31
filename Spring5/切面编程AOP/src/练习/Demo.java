package 练习;
import java.lang.reflect.Proxy;
import java.sql.Driver;

public class Demo  {
    public static void main(String[] args) {
        Class[] classes=new Class[1];
        classes[0]=User.class;
        Object o = Proxy.newProxyInstance(Demo.class.getClassLoader(), classes, new UserDao(new UserLmpl()));
        User obj=(User)o;
        obj.register();


    }

}
