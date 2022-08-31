package 无接口.基础;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class Dao {


    @Before(value = "execution(* 无接口.User.add(..))")
    @Order(value = 1)
public void op(){
    System.out.println("已增强");
}


}
