package 多线程和高并发.多线程.Thread.优先级;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int a=0;a<100;a++){
            System.out.println(getName()+":"+a);
        }
    }
}
