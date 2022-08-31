package 数据结构和算法.数据结构.树.二叉树.有序树.二叉查找树;

public class Node {
    private int value;
    private Node left;
    private Node right;


//    添加结点
public void  add(Node node){
    if (node.getValue()<this.value){  //添加的结点<当前结点,放到左边

        if (this.left==null) {        //如果左边是叶子结点
            this.left=node;          //添加
        }else {                             //如果左边是树
            this.left.add(node);//递归到左边叶子结点
        }

    }else {                                              //添加的结点>当前结点
           if (this.right==null){              //如果是右边是叶子结点
               this.right=node;                //新结点添加到右叶子结点
           }else {                                     //如果右边是树
               this.right.add(node);        //递归到右边叶子结点
           }
    }
}

//查找算法
         public Node mode(int node) {

             if (this.value == node) {
                 return this;

             } else  if (node < this.value) {
                     if (this.left!=null)
                 return this.left.mode(node);

             } else {
                 if (this.right!=null)
                 return this.right.mode(node);
             }
             return null;
         }
//      查找父结点
           public  Node io(int value){
               if (this.left!=null&&this.left.value == value||this.right!=null&&this.right.value==value) {
                   return this;
               }
                     if (this.left!=null){
                        return this.left.io(value);
                     }
                if (this.right!=null){
                    return this.right.io(value);
                }

               return null;
           }

    public Node(int value) {
        this.value = value;
    }

    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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
    public String toString() {
        return
                "value=" + value ;

    }
}
