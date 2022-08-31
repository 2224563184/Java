package 数据结构和算法.数据结构.线性结构.链表.单链表;

import 数据结构和算法.数据结构.线性结构.链表.单链表.练习.People;
import 数据结构和算法.数据结构.线性结构.链表.单链表.练习.WaterMargin;

public class 插队式反转链表 {
    public static void main(String[] args) {
        WaterMargin waterMargin = new WaterMargin();
        waterMargin.add("宋江",1);
        waterMargin.add("武松",2);
        waterMargin.add("李逵",3);
        waterMargin.add("孟获",4);
        waterMargin.add("诸葛亮",5);

//       返回链表头
        People forst = waterMargin.get();

//        指针, 指向链表头
     People  l=null;
    int  size=0;

      if (forst.next!=null){
        while (forst!=null) {
//            l临时变量
            People e = forst;
            forst = forst.next;
            if (l == null) {
                l = e;
                l.next = null;
            } else {
                People last = l;
                l = e;
                e.next = last;
            }
            size++;
        }
        }else {
          l=forst;
      }
         while (l!=null){
             System.out.println(l);
             l=l.next;
         }










    }
}
