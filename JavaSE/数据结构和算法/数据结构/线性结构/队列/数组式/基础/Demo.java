package 数据结构和算法.数据结构.线性结构.队列.数组式.基础;

public class Demo {
    public static void main(String[] args) {
        Arrque<Integer> arrque = new Arrque<>(3);
        arrque.add(1);
        arrque.add(2);
        arrque.add(3);

        try {

            arrque.get();
            arrque.get();
            arrque.get();
            arrque.get();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
