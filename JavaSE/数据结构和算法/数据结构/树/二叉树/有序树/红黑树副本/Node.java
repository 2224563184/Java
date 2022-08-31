package 数据结构和算法.数据结构.树.二叉树.有序树.红黑树副本;

public class Node {
   private int key,cocolor;
    private Node Lchiid;
    private Node Rchiid;

    public int getCocolor() {
        return cocolor;
    }

    public void setCocolor(int cocolor) {
        this.cocolor = cocolor;
    }




    public Node() {
    }

    public Node(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getLchiid() {
        return Lchiid;
    }

    public void setLchiid(Node lchiid) {
        Lchiid = lchiid;
    }

    public Node getRchiid() {
        return Rchiid;
    }

    public void setRchiid(Node rchiid) {
        Rchiid = rchiid;
    }
}
