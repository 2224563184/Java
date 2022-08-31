package OOP.多态.案例.子类继承子类;

public  class 猫类 extends 动物类{

    @Override
    public void eat() {
        System.out.println("猫");

    }

    public 猫类() {

    }

    public 猫类(String name, String age) {
        super(name, age);
    }
}
