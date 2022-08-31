package 多线程和高并发.多线程.Thread.基础;

public class MyThread extends Thread{
    public MyThread(){

    }
    public MyThread(String name){
       super(name);
    }

    @Override
    public void run() {
        for (int a=0;a<10000;a++){
            System.out.println(getName()+":"+a);
        }
    }
}
/*
一、
  private  String name;
二、默认名称
   public Thread() {
    init(null, null, "Thread-" +    nextThreadNum(), 0);   //Thread-使用this.name
}

1.
Thread-：
 private void init(ThreadGroup g, Runnable target, String name,
  long stackSize) {
    init(g, target, name, stackSize, null, true);
}
 private void init(ThreadGroup g, Runnable target, String name,
   long stackSize, AccessControlContext acc,
   boolean inheritThreadLocals)
   this.name = name;              name变量赋值给this.name
2.
nextThreadNum()：
    private static int threadInitNumber;   //第一次0；1，2...
    private static synchronized int nextThreadNum() {
    return threadInitNumber++;         //第一次返回0；然后++变成1...

三、无参设置名称
    public final synchronized void setName(String name) {
    this.name = name;
}

四、 返回名称
    public final String getName() {
    return name;
}
五、带参设置名称
 public Thread(String name) {
    init(null, null, name, 0);
}

 */