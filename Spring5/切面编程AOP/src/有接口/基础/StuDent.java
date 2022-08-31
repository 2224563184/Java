package 有接口.基础;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StuDent implements InvocationHandler {
  private User user;
    public StuDent(Object obj) {
       this.user=(User) obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(uiser());
        System.out.println(method.invoke(user,args));

        System.out.println(add());
        return "结束";
    }

    private String uiser(){
        return "登陆前";
    }

    private String add(){
        return "验证完成";
    }
}
