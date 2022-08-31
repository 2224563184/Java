package 多线程和高并发.多线程.Thread.线程控制;

public class 九子夺嫡Demo {
    public static void main(String[] args) throws InterruptedException {
        九子夺嫡 ts1=new 九子夺嫡("康熙");
        九子夺嫡 ts2=new 九子夺嫡("二阿哥");
        九子夺嫡 ts3=new 九子夺嫡("大阿哥");
        九子夺嫡 ts4=new 九子夺嫡("三阿哥");
        九子夺嫡 ts5=new 九子夺嫡("四阿哥");
        九子夺嫡 ts6=new 九子夺嫡("九阿哥");
        九子夺嫡 ts7=new 九子夺嫡("十阿哥");
        九子夺嫡 ts8=new 九子夺嫡("十三阿哥");
        九子夺嫡 ts9=new 九子夺嫡("十四阿哥");
        九子夺嫡 ts10=new 九子夺嫡("八阿哥");
        ts1.start();
        ts1.join();
        ts2.start();
        ts3.start();
        ts4.start();
        ts5.start();
        ts6.start();
        ts7.start();
        ts8.start();
        ts9.start();
        ts10.start();


    }
}
