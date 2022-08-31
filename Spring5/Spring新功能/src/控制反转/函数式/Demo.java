package 控制反转.函数式;

import com.sun.jndi.toolkit.url.GenericURLDirContext;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericApplicationContext;

public class Demo
{

    public static void main(String[] args) {
//        创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
//        注册bean对象
        context.refresh();
        context.registerBean(student.class,()->new student());
    }
    @Test
    public void andd(){
        System.out.println(1221);
    }
}
