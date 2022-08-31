package 练习;

import org.apache.commons.dbutils.QueryRunner;
import org.aspectj.lang.annotation.Aspect;
import 练习.UserLmpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Scanner;

public class UserDao implements InvocationHandler {
    private Object object;
    public UserDao(UserLmpl userLmpl) {
        this.object=userLmpl;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
          method.invoke((UserLmpl)object,args);
          aVoid();
        return null;
    }

    private void aVoid(){
        int sj=(int)(Math.random()*100*100);
        System.out.println(sj);
        System.out.print("请输入验证码:");
        Scanner scanner=new Scanner(System.in);
        int anInt = scanner.nextInt();
        if (anInt==sj){
            System.out.println("正确");
            return;
        }
        System.out.println("错误");
        QueryRunner queryRunner = new QueryRunner();
    }
}
