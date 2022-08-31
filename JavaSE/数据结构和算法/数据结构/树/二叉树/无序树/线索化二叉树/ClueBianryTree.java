package 数据结构和算法.数据结构.树.二叉树.线索化二叉树;

public class ClueBianryTree {
    private HerNode root;
    private  HerNode pre;

    public HerNode getRoot() {
        return root;
    }

    public void setRoot(HerNode root) {
        this.root = root;
    }

    public HerNode getPre() {
        return pre;
    }

    public void setPre(HerNode pre) {
        this.pre = pre;
    }

    public void clueNode(HerNode node){

        if (node==null)                                  //递归出口
            return;

        clueNode(node.getLeft());              //左递归


        if (node.getLeft()==null){                //左递归以后
            node.setLeft(pre);           //叶子节点指向  pre节点
            node.setNoRigth(1);      //叶子节点的No值设置为1 ,
        }

         if (pre!=null&&pre.getRight()==null){
          pre.setRight(node);
          pre.setNoRigth(1);
         }

         pre=node;
       clueNode(node.getRight());

    }
    public void op(){
        clueNode(root);
    }

}
