package OOP.多态.案例;

public class 猫类 extends 动物类{
    public 猫类() {
    }

    public 猫类(String name, String age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("猫吃饭");
    }
}
