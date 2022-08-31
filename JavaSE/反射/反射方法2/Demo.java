package 反射.反射方法2;

import java.lang.reflect.Constructor;

public class Demo {
    public static void main(String[] args) {
        Class<Stud> c = Stud.class;
        Constructor<?>[] cc = c.getDeclaredConstructors();
        for (Constructor s:cc){
            System.out.println(s);
        }

    }
}
