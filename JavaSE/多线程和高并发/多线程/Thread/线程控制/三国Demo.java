package 多线程和高并发.多线程.Thread.线程控制;

public class 三国Demo {
    public static void main(String[] args) {
        三国 ts1=new 三国();
        三国 ts2=new 三国();
        三国 ts3=new 三国();

        ts1.setName("曹操");
        ts2.setName("刘备");
        ts3.setName("孙权");

        ts1.start();
        ts2.start();
        ts3.start();

    }
}
