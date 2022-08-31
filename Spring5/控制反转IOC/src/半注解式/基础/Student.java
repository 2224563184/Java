package 半注解式.基础;

//@Service(value = "student")
public class Student {
   private  int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
        System.out.println("student构造器");
    }

}
