package 数据结构和算法.数据结构.树.二叉树.无序树.二叉树;

public class BinaryTree {
    private HeroNode root;


    public HeroNode getHeroNode() {
        return root;
    }

    public void setHeroNode(HeroNode root) {
        this.root = root;
    }



    //    前序遍历
    public void preOrder(){
            if (this.root!=null){
           this.root.preOrder();
        }else {
            System.out.println("前序遍历=空");
        }

    }
//    中序遍历
    public void  intOrder(){
        if (this.root!=null){
            this.root.infixOrder();
        }else {
            System.out.println("中序遍历=空");
        }
    }
//  后序遍历
    public  void posOrder(){
        if (this.root!=null){
            this.root.postOrder();
        }else {
            System.out.println("后序遍历=空");
        }

    }
    public HeroNode pr(int no){
        if (root!=null){
            if (no==root.getNo())
                return root;
        }
        root.Ordersearch(no);
        return null;
    }
    public HeroNode remode(int no){
        if (this.root==null||root.getLeft()==null&&root.getRight()==null){
            root=null;
            return  null;
        }
        root.remode(no);
        return null;
    }

}
