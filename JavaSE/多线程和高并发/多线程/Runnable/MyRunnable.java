package 多线程和高并发.多线程.Runnable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"："+i);
        }
    }
}
