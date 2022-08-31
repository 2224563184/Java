package 数据结构和算法.数据结构.树.二叉树.哈夫曼树;

public class Node implements Comparable<Node> {
    private Node Left;
    private Node rigth;
    private int     value;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return Left;
    }

    public void setLeft(Node left) {
        Left = left;
    }

    public Node getRigth() {
        return rigth;
    }

    public void setRigth(Node rigth) {
        this.rigth = rigth;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void   pre(){                        //前序遍历
        System.out.println(this);
        if (this.Left!=null)
            this.Left.pre();

        if (this.rigth!=null)
            this.rigth.pre();
    }

    @Override
    public int compareTo(Node node) {
        return this.value- node.value;
    }
}
