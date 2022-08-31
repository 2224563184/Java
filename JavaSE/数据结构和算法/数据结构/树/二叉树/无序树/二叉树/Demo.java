package 数据结构和算法.数据结构.树.二叉树.无序树.二叉树;

public class Demo {

    public static void main(String[] args) {
//    创建树
        BinaryTree binaryTree = new BinaryTree();
//     创建节点
        HeroNode<Object> root = new HeroNode<>(1, "宋江");
     HeroNode<Object> node2 = new HeroNode<>(2, "吴用");
       HeroNode<Object> node3 = new HeroNode<>(3, "卢俊义");
       HeroNode<Object> node4 = new HeroNode<>(4, "林冲");
       HeroNode<Object> node5 = new HeroNode<>(5, "关胜");

       HeroNode<Object> node6 = new HeroNode<>(6, "null");
       HeroNode<Object> node7 = new HeroNode<>(7, "null");
       HeroNode<Object> node8 = new HeroNode<>(8, "null");
       HeroNode<Object> node9 = new HeroNode<>(9, "null");
       HeroNode<Object> node10 = new HeroNode<>(10, "null");
       HeroNode<Object> node11 = new HeroNode<>(11, "null");
       HeroNode<Object> node12 = new HeroNode<>(12, "null");
       HeroNode<Object> node13 = new HeroNode<>(13, "null");
       HeroNode<Object> node14 = new HeroNode<>(14, "null");
       HeroNode<Object> node15 = new HeroNode<>(15, "null");
       HeroNode<Object> node16 = new HeroNode<>(16, "null");
       HeroNode<Object> node17 = new HeroNode<>(17, "null");


//             根节点
        root.setLeft(node2);
        root.setRight(node3);

        node3.setLeft(node5);
        node3.setRight(node4);
        node2.setLeft(node6);
        node6.setLeft(node7);
        node7.setRight(node8);
        node6.setRight(node9);
        node2.setRight(node10);
        node8.setLeft(node11);
        node11.setLeft(node12);
        node12.setRight(node13);
        node10.setLeft(node14);
        node10.setRight(node16);
        node14.setRight(node15);
        node5.setRight(node17);

        HeroNode ordersearch = root.Ordersearch(5);
        System.out.println(ordersearch);

    }


}
