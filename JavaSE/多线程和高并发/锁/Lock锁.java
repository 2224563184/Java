package 多线程和高并发.锁;

public class Lock锁 {


    public static void main(String[] args) {
        booking bk = new booking();
        Thread t = new Thread(bk);
        t.setName("窗口一");
        t.start();


    }
}