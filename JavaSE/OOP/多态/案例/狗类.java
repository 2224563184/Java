package OOP.多态.案例;

public class 狗类 extends 动物类{
    public 狗类() {
    }

    public 狗类(String name, String age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("狗吃饭");
    }
}
