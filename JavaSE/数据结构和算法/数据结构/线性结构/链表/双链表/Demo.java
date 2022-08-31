package 数据结构和算法.数据结构.线性结构.链表.双链表;

import 数据结构和算法.数据结构.线性结构.链表.Node;

public class Demo {
    public static void main(String[] args) {
        双链表<Integer> obj = new 双链表<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        Node l=obj.first;
        while (l!=null){
            System.out.println(l);
              l=l.next;
        }

    }
}
