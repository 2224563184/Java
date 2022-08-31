package 数据结构和算法.数据结构.树.二叉树.线索化二叉树;

public class Demo {
    public static void main(String[] args) {
        HerNode root = new HerNode(1, null);
        HerNode node2 = new HerNode(2, null);
        HerNode node3 = new HerNode(3, null);
        HerNode node4 = new HerNode(4, null);
        ClueBianryTree clueBianryTree = new ClueBianryTree();
        root.setLeft(node2);
        root.setRight(node3);
        node2.setRight(node4);
        clueBianryTree.setRoot(root);

         clueBianryTree.op();
    }
}
