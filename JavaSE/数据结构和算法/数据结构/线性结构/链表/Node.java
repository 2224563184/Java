package 数据结构和算法.数据结构.线性结构.链表;

public class Node <E>{
    E item;
  public Node next;
  public Node prev;

    public Node(E e) {
        item=e;
    }

    @Override
    public String toString() {
        return "" +item;

    }
}
