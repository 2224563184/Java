package OOP.继承;

import OOP.继承.子类;

public class 测试 {
    public static void main(String[] args) {
        子类 f = new 子类();

      f.eat();//方法重写

       f.eeat();
    }
}
/*
* 成员变量： 编译看左边，执行看左边。
* 成员方法：编译看左边，执行看右边
*
* Q 为什么成员变量和成员方法的访问不一样?
* A 因为成员方法有重写，而成员变量没有
* 只改变成员方法，不改变成员变量
*
*
* 多态继承：
*           任何成员方法都必须经过父类，子类只是用来重写方法或者继承。
*
* */