package OOP.多态.案例.子类继承子类;

public class Demo {
    public static void main(String[] args) {
        动物类  m=new 猫类();
        m.setName("加菲");
        m.setAge("10");
        m.eat();
        System.out.println("\t"+m.getName()+m.getAge());
        System.out.println("--------");
        动物类 f=new 猫类("布偶","20");
        System.out.println("\t"+f.getName()+f.getAge());
//-----------------------------------------------------------------------------------
        动物类 g=new 狗类();
        g.setName("金毛");
        g.setAge("10");
        System.out.println(g.getName()+g.getAge());
    }
}
