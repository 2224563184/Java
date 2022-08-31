package 数据结构和算法.数据结构.树.二叉树.无序树.二叉树;

public class HeroNode<E>{
    private HeroNode left;
    private HeroNode right;
    private int   no;

    public HeroNode(int no, String name) {

        this.no = no;
        this.name = name;
    }

    private String name;


    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  preOrder(){
        System.out.println(this);
      if (left!=null){
         this.left.preOrder();
      }
      if (right!=null){
          this.right.preOrder();
      }
    }
    public  void infixOrder(){
        if (this.left!=null){
            this.left.infixOrder();
        }
        System.out.println(this);
        if (this.right!=null){
            this.right.infixOrder();
        }
    }
    public void postOrder(){
        if (this.left!=null){
            this.left.postOrder();
        }
        if (this.right!=null){
            this.right.postOrder();
        }
        System.out.println(this);
    }


//查找二叉树的节点
 public HeroNode Ordersearch(int no){
     HeroNode heroNode =null;
//        判断根
     if (this.no==no){
         return this;
     }
//递归左儿子
    if (this.left!=null){
     heroNode = this.left.Ordersearch(no);
    }
//找到了节点
    if (heroNode !=null){
       return heroNode;
    }
//递归右儿子
    if (this.right!=null){
          heroNode = this.right.Ordersearch(no);
    }
     return heroNode;

 }

public  HeroNode remode(int no){
        if (this.left!=null&&this.left.no==no){
            this.left=null;
            return null;
        }

    if (this.right!=null&&this.right.no==no){
        this.right=null;
        return null;
    }

        if (this.right!=null&&this.right.no==no){
            this.right=null;
            return null;
        }

        if (this.left!=null){
            this.left.remode(no);
        }
    if (this.right!=null){
        this.right.remode(no);
    }
    return null;
}





    @Override
    public String toString() {
        return  no+"\t" +name;

    }
}
