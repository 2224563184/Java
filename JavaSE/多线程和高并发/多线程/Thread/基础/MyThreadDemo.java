package 多线程和高并发.多线程.Thread.基础;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1=new MyThread();
        MyThread my2=new MyThread();
//设置名称：
        my1.setName("飞机");
        my2.setName("高铁");
        my1.start();
        my2.start();
//带参设置名称
        MyThread my3=new MyThread("大车");
        MyThread my4=new MyThread("小车");
// 需要在对象类中添加 无参构造和带参构造
    }
}
