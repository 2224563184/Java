package 多线程和高并发.多线程.Thread.优先级;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread tp1=new MyThread();
        MyThread tp2=new MyThread();
        MyThread tp3=new MyThread();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");
//设置优先级:
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);
//     默认优先级5、最小1、最大10
        tp1.start();
        tp2.start();
        tp3.start();

//        System.out.println(tp1.getPriority());  查看优先级

    }
}
