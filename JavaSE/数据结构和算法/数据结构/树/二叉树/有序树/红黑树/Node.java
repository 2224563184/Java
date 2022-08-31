package 数据结构和算法.数据结构.树.二叉树.有序树.红黑树;

public class Node <T extends Comparable>{
    private  Node parent;
    private Node Left;
    private Node Right;
    private boolean color;
    private T key;
    private  T value;
    private Node<T> root;


    public Node(Node parent, Node left, Node right, boolean color, T key, T value) {
        this.parent = parent;
        Left = left;
        Right = right;
        this.color = color;
        this.key = key;
        this.value = value;
    }

    public Node(T key, T value,Node parent) {
        this.key = key;
        this.value = value;
        this.parent=parent;

    }

    public Node() {
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeft() {
        return Left;
    }

    public void setLeft(Node left) {
        Left = left;
    }

    public Node getRight() {
        return Right;
    }

    public void setRight(Node right) {
        Right = right;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    private void  leftRotate(Node<T> p,Node root){
        Node r=p.getRight();   //右孙节点

        if (p!=null){
            p.setRight(r.getLeft()); //子节点的右指针,指向右孙节点的左边

            if (r.getLeft()!=null){      //右孙节点有左太孙节点
                r.getLeft().setParent(p);//左太孙节点,指向子节点
            }
            r.setParent(p.getParent());//右孙节点,指向父节点

            if (p.parent==null)            //如果子节点是根节点
                root=r;                           //根指针,指向右子节点
        }else if (p.parent.Left==p){
            p.parent.Left=r;
        }else {
            p.parent.setRight(r);
        }
        r.setLeft(p);
        p.parent=r;


    }

    private void rightLeft(Node<T> p, Node root){
        Node l=p.getLeft();   //右孙节点

        if (p!=null){
            p.setLeft(l.getRight()); //子节点的右指针,指向右孙节点的左边

            if (l.getRight()!=null){      //右孙节点有左太孙节点
                l.getRight().setParent(p);//左太孙节点,指向子节点
            }
            l.setParent(p.getParent());//右孙节点,指向父节点

            if (p.parent==null)            //如果子节点是根节点
                root=l;                           //根指针,指向右子节点
        }else if (p.parent.getRight()==p){
            p.parent.setRight(l);
        }else {
            p.parent.setLeft(l);
        }
        l.setRight(p);
        p.parent=l;


    }
    public  void  add(T key, Node<T> left,Node<T> parent){
          this.parent=parent;
          this.setLeft(left);
          this.setRight(this.getRight());
          this.color=color;

    }
    public  void  put(T key,T value){
        Node<T> t=this.root;
        if (t==null){
            new Node<T>(key,value==null?key:value,null);
        }
    }
public  void fixAfterPut(Node<T> x){

}

}
