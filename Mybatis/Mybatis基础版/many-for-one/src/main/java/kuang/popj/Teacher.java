package Levelcache1.popj;

import lombok.Data;
@SuppressWarnings("all")
@Data
public class Teacher {
    @Override
    public String toString() {
        return
                "   姓名=" + name +
                "   年龄=" + age ;

    }

    private String name;
    private  int   age;
   private   int  tid;
}
