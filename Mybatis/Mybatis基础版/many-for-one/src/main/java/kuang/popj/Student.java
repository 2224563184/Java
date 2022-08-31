package Levelcache1.popj;

import lombok.Data;
@SuppressWarnings("all")
@Data
public class Student {
    @Override
    public String toString() {
        return
                "姓名=" + name +
                "   年龄=" + age +
                "   "+teacher ;
    }

    private String      name;
    private  int          age;
    private  int          tid;
    private Teacher      teacher;
}
