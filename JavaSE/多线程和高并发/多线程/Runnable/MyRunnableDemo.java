package 多线程和高并发.多线程.Runnable;

/*

二、Runnable
1.实现Runnable接口
①定义一个MyRunnable类 实现Runnable接口
②在MyRunnable类中重写run()方法
③创建MyRunnable类的对象
④创建Thread类的对象，把MyRunnable对象作为构造方法的参数
⑤启动线程
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
//创建Runnable对象
        MyRunnable my=new MyRunnable();
//创建Thread对象
        Thread t1=new Thread(my,"高铁");
        Thread t2=new Thread(my,"飞机");
        t1.start();
        t2.start();


    }
}
