package 无接口.基础;

import org.springframework.stereotype.Component;

@Component
public class User {

    public void add(){
        System.out.println("切入点");
    }
}
