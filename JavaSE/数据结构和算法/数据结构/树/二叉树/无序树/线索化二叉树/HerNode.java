package 数据结构和算法.数据结构.树.二叉树.线索化二叉树;

public class HerNode {
   private HerNode left;
   private HerNode right;
    private int  no;
    private  String name;

    public HerNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public HerNode() {
    }

    public HerNode getLeft() {
        return left;
    }

    public void setLeft(HerNode left) {
        this.left = left;
    }

    public HerNode getRight() {
        return right;
    }

    public void setRight(HerNode right) {
        this.right = right;
    }

    public int getNo() {
        return no;
    }

    public void setNoRigth(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "no=" + no ;

    }


    public  void delNode(int no){           //删除

        if (this.left!=null&&this.left.no==no){
            this.left=null;
            return;
        }

        if (this.right!=null&&this.right.no==no){
            this.right=null;
            return;
        }

        if (this.left!=null){
            this.left.delNode(no);
        }

        if (this.right!=null){
            this.right.delNode(no);
        }
    }

    public void pre(){                          //查找

        System.out.println(this);
        if (this.left!=null)
            this.left.pre();
        if (this.right!=null)
            this.right.pre();

    }

    public HerNode  preSet(int no){   //更新
        if (this.no==no)
            return this;

        HerNode herNode=null;

        if (this.left!=null)    //左递归
            herNode=this.left.preSet(no);

        if (herNode!=null) //找到了
            return herNode;

        if (this.right!=null)  //右递归
            herNode=this.right.preSet(no);

        if (herNode!=null)  //找到了
            return herNode;

        return herNode;

    }


}
