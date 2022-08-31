package 多线程和高并发.多线程.Thread.线程控制;

public class 三国 extends Thread {
    public void 三国(){

    }



    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
