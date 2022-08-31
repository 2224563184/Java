package 多线程和高并发.多线程.Thread.线程控制;

public class 刘关张 extends Thread{
    public void my() {
    }
    public 刘关张(String name){
        super(name);
    }
      @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
