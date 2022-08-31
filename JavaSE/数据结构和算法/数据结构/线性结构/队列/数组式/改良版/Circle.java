package 数据结构和算法.数据结构.线性结构.队列.数组式.改良版;

public class Circle<E> {
    private int maxSize; //最大容量
    private  int fornt;  //   取出索引
    private  int rear; //     保存索引
    private  Object []arr;
    public Circle(int sizeMax){
        arr=new Object[sizeMax];
       this.maxSize=sizeMax;
    }
//   取出==最后保存,证明已经取完
public void add(E e){
    if (isFull()){
        System.out.println("队列满了");
        return;
    }
    arr[rear]=e;
   rear++;
}
    public boolean isEmpt(){
    return rear==fornt;
    }
    public E get(){
     if (isEmpt()){
//         如果取出的数据==保存的最大值
//         那么从头开始
         Object o = arr[fornt];
         fornt=0;
         return (E) o;
     }
//1, 取出0索引元素
        Object o = arr[fornt];
// 2. 0+1
        fornt=(fornt+1+maxSize)%maxSize;
        return (E) o;
    }
    //    判断队列已满
    public boolean isFull(){
        return  rear==maxSize;
    }
}
