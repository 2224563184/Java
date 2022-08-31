package 数据结构和算法.数据结构.线性结构.链表.单链表.练习;

public class WaterMargin {

   private People forst;   // 引用头
    private People last;  //  引用尾
                  int      num;
                  int      size;

    public void add(String name, int   age  ){
        People l=last;      //临时变量,更新前保存对象
        People people = new People(name,age);
        last=people;       //更新对象地址
        if (forst==null){
            forst=people;
        }else {
            l.next=people;
        }
        num++;
    }
public void delete( ){
    People next=forst.next;  //临时变量,保存下一个
    forst.next=null;
    forst=next;
}


    public People get(){
        return forst;
    }

    public int list(){
        People l=forst;
        while (l!=null){
            System.out.println("姓名="+l.name+"\t"+"年龄="+l.age);
            l=l.next;

        }
        return size;
    }

    public void delate(){
        People next = forst.next; //临时变量
       forst.next=null;
       forst=next;

    }

    public int getNum(){
        return num;
    }

}
