package 数据结构和算法.数据结构.线性结构.链表.环形链表;

import 数据结构和算法.数据结构.线性结构.链表.Node;

public class Demo {
    public static void main(String[] args) {
        环形链表<Integer> ind = new 环形链表<>();
        ind.add(1);
        ind.add(2);
        ind.add(3);
        ind.add(4);
        Node getfirst = ind.getfirst();
        Node an=getfirst;
        Node l= getfirst;

while (true){
    System.out.println(l);
    l=l.next;
      if (an==l){
          break;
      }

}


do {
//    l=l.next;
    System.out.println(l);
    l=l.next;
   }while (l!=an);

    }

}
