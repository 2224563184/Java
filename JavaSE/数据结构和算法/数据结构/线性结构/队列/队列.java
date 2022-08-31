package 数据结构和算法.数据结构.线性结构.队列;

import java.util.Iterator;
import java.util.LinkedList;

public class 队列 {
    public static void main(String[] args) {

        LinkedList<Object> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);                              //存入
        Object poll = list.poll();       // 取出
        System.out.println("poll="+poll);
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
