package 数据结构和算法.数据结构.线性结构.链表.环形链表;

import 数据结构和算法.数据结构.线性结构.链表.Node;

public class 环形链表<E> {
    Node<E>  first;
    Node<E>   last;
   int      size;

    public  void  add(E e){
        Node l=last;
        Node<E> node = new Node<>(e);
        last=node;
        if (first==null){
            first=node;
            first.prev=first;
            first.next=first;
        }else {
            l.next=last;   //第上一个个节点的next指向下一个节点
            last.prev=l; //下一个节点的prev指向上一个节点
            last.next=first;//节点尾指向节点头
            first.prev=last;//节点头指向节点尾
        }
        size++;
    }
    public  int getSize(){
        return size;
    }
    public  Node getfirst(){
        return first;
    }
    public  Node getlast(){
        return last;
    }
}
