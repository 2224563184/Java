package 数据结构和算法.数据结构.线性结构.链表.单链表.练习;

public class People {
    public   String name;
    public   int     age;
   public People next;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "姓名="+name+"\t"+"年龄="+age;
    }
}
