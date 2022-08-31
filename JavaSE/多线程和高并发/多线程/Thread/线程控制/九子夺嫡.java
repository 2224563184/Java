package 多线程和高并发.多线程.Thread.线程控制;

public class 九子夺嫡 extends Thread{
    private void 九子夺嫡(){

    }
    九子夺嫡(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
        }

    }
}
