package 数据结构和算法.数据结构.线性结构.栈.波兰表达式.传统方法;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack stack=new Stack();
      int i=0;
        stack.add(1);
        stack.add(2);
        stack.add(3);
        while (stack.size()>0){
            System.out.println(stack.pop());
        }

    }
}
