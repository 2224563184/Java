package 数据结构和算法.数据结构.线性结构.链表.双链表;

import 数据结构和算法.数据结构.线性结构.链表.Node;

public class 双链表 <E>{
    public  Node first;
    public  Node last;

    public void add(E e){

        Node<E> node = new Node<>(e);
        if (first==null){
            first=node;
            last=first;
        }else {
      last.next=node;
      node.prev=last;
      last=node;
        }
    }

}
