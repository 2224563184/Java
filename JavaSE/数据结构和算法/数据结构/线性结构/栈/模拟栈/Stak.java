package 数据结构和算法.数据结构.线性结构.栈.模拟栈;

public class Stak {
    private int  arr[];
    private int Tail;
    private  int maxleng;

    public  Stak(int maxleng){
        this.maxleng=maxleng;
        arr=new int[this.maxleng];
        Tail=-1;
    }
    public boolean isMax(){
        return Tail==maxleng-1;
    }

    public boolean isNull(){
        return Tail==-1;
    }
    public  boolean add(int e){
          if (isMax()){
              throw  new RuntimeException("栈已满");
          }
          Tail++;
          arr[Tail]=e;
          return true;
    }
    public  int Extraction(){
        if (isNull()){
            throw  new RuntimeException("空栈");
        }
        return arr[Tail--];
    }
}
