package 纯注解式.基础;

public class Student {
    private  String  name;
    private  int    age;

    @Override
    public String toString() {
        return
                "name='" + name +
                ", age=" + age ;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
