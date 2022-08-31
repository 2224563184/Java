package 数据结构和算法.数据结构.树.二叉树.有序树.二叉查找树;

public class Test {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node root = new Node(4);
        Node node5 = new Node(5);
             root.setLeft(node2);
             root.setRight(node5);

             node2.setLeft(node1);
             node2.setRight(node3);

        Node mode = root.mode(5);

        System.out.println(mode);
    }
}
