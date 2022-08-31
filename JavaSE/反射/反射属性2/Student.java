package 反射.反射属性2;

public class Student {
    private String name;
    private int    age;
    public  String add;

    public Student() {
    }

    public Student(String name, int age, String add) {
        this.name = name;
        this.age = age;
        this.add = add;
    }

    @Override
    public String toString() {
        return  name+"\t"+age+"\t"+add;
    }
}
