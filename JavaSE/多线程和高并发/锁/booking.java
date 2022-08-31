package 多线程和高并发.锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class booking implements Runnable{
    private int tickts=100;
private Lock lock=new ReentrantLock();


    @Override
    public void run() {
        while (true){
           lock.lock();
            if (tickts>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在出售第"+tickts+"张票");
                tickts--;
            }lock.unlock();
        }

    }
    }

