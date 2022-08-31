package 数据结构和算法.数据结构.线性结构.队列.数组式.基础;

public class Arrque <E>{
   private Object [] arr;
   private int front;
   private int Ending;
   private int ArrMax;

    public Arrque(int Max){
        this.ArrMax=Max;
      this.arr=new Object[ArrMax];
      front=-1;
      Ending=-1;

    }
    public boolean isnull(){
       return front==Ending;
    }

    public  boolean isMax(int or){
       return or==ArrMax-1;
    }

    public void add(E e){// 添加方法
//        判断过界
      if (isMax(Ending)){
          throw  new RuntimeException("数组过界");
      }
      Ending++;
        arr[Ending]=e;

    }

// public E getid(){
//        if (isnull()){
//            throw new RuntimeException("空数组");
//        }
//        if (isMax(front)){
//            throw new RuntimeException("数组过界");
//        }
//        front++;
//        return (E)(arr[front]);
// }
//    遍历数组
 public void  travel  (){
        if (isnull()) {
        throw new RuntimeException("空数组");
    }

     for (int i = 0; i < ArrMax; i++) {
         System.out.println(arr[i]);
     }
}
//取数据
    public E get(){

        if (front==Ending){
            throw new RuntimeException("数组过界");
        }

        front++;
        Object o = arr[front];


  return (E)o;
    }

//    查看数组头
    public void show(){
        if (isnull()){
            throw new RuntimeException("空数组");
        }

        for (int i = front; i < ArrMax; i++) {
            if (i==-1){
               continue;
            }
            System.out.println(arr[i]);

        }

    }
    }


