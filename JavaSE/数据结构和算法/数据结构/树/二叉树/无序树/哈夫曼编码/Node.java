package 数据结构和算法.数据结构.树.二叉树.无序树.哈夫曼编码;

public class Node<E> implements Comparable {
    private int value;
    private  Byte by;
    private  Node left;
    private  Node right;

    public Node(int value,Byte by) {
        this.value=value;
        this.by = by;
    }
    public Node(Byte by) {

        this.by = by;
    }
    public Node() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Byte getBy() {
       return by;
    }

    public void setBy(byte by) {
        this.by = by;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public int compareTo(Object obj) {
        Node node=(Node)obj;
        return this.value-node.value;
    }


    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
    public void  aVoid(){
        System.out.println(this);
        if (this.left!=null)
            this.left.aVoid();
        if (this.right!=null)
            this.right.aVoid();
    }
}
