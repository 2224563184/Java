package 数据结构和算法.数据结构.线性结构.队列.数组式.改良版;

public class Demo {
    public static void main(String[] args)throws Exception {
        Circle<Object> circle = new Circle<>(2);

        circle.add(1);
        circle.add(2);
        Object o1 = circle.get();
        Object o2 = circle.get();
        Object o3 = circle.get();
        Object o4 = circle.get();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        Object o5 = circle.get();
        System.out.println(o5);


    }
}
