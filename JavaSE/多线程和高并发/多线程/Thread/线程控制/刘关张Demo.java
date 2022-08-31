package 多线程和高并发.多线程.Thread.线程控制;

public class 刘关张Demo {
    public static void main(String[] args) {
              九子夺嫡 td1=new 九子夺嫡("关羽");
              九子夺嫡 td2=new 九子夺嫡("张飞");
              刘关张 td3=new 刘关张("刘备");

//设置守护线程：
              td1.setDaemon(true);
              td2.setDaemon(true);

              td1.start();
              td2.start();
              td3.start();
//  当运行的线程只剩下守护线程时，JVM虚拟机将退出

    }
}
