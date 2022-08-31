package 数据结构和算法.数据结构.树.二叉树.有序树.二叉查找树;

public class 删除 {
    Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void deLect(Node node, Node father , Node root){

        //空树
          if (root==null){
              return;
          }


        //叶子结点,直接删除
            if (node.getLeft()==null&&node.getRight()==null){
               if (father.getLeft().getValue()==node.getValue()){ //父结点的左边
                   father.setLeft(null);
                   return;
               }
               if (father.getRight().getValue()==node.getValue()){//父结点的右边
                   father.setRight(null);
                   return;
               }
            }


//       单结点
            if (node.getLeft()!=null&&node.getRight()==null){           //左单结点

                if (father.getLeft().getValue()==node.getValue()){          //当前结点在父结点的左边
                    father.setLeft(node.getLeft());
                    return;
                }else if (father.getRight().getValue()==node.getValue()){  //当前结点在父结点的右边
                     father.setRight(node.getLeft());
                  return;
                }
            }else if (node.getLeft()==null&&node.getRight()!=null){      //右单结点

                if (father.getLeft().getValue()==node.getValue()){               //当前结点在父结点的左边
                   father.setLeft(node.getRight());
                   return;
                }else if (father.getRight().getValue()==node.getValue()){   //当前结点在父结点的右边
                    father.setRight(node.getRight());
                    return;
                }
            }


//            双儿结点
             if(node.getLeft()!=null&&node.getRight()!=null&&father!=null){
                 Node min = min(node.getRight());       //找到右子树最小结点,并且让它的父结点断开最小结点
                    min.setLeft(node.getRight());              //最小结点连接当前结点的右子树
                    if (node.getValue()==father.getLeft().getValue()){  //当前结点在父结点的左边
                        father.setLeft(min);                                                  //父结点的左边连接最小结点
                        return;
                    }else if (node.getValue()==father.getRight().getValue()){//当前结点在父结点的右边
                        father.setRight(min);                                                  //父结点的右边连接最小结点
                        return;
                    }
             }

//             独根
        if (root.getLeft()==null&&root.getRight()==null){
            root=null;
        }
//              双子树的根结点
         if (node.getValue()==root.getValue()&&node.getLeft()!=null&&node.getRight()!=null){
             Node min = min(root.getRight());
            min.setLeft(root.getLeft());
            Node T=root.getRight();
            root.setLeft(null);
            root.setRight(null);
            root=T;
            return;
         }
//              单子树的根结点
           if (node.getValue()==root.getValue()&&node.getLeft()!=null){
               root= node.getLeft();
               node.setLeft(null);
               return;
           }else     if (node.getValue()==root.getValue()&&node.getRight()!=null) {
            root=node.getRight();
            node.setRight(null);
           }
           }
    public  Node min(Node node){

        Node t=node;      //右子树
               while (t.getLeft()!=null){
                   t=t.getLeft();
              }
        Node faT = fa(root,t.getValue());
               faT.setLeft(null);
        return t;
    }

    public Node fa(Node root, int value){
                if (root.getLeft()!=null&&root.getLeft().getValue()==value||root.getRight()!=null&&root.getRight().getValue()==value){
                    return root;
                }
                if (root.getLeft()!=null){
                return     fa(root.getLeft(),value);
                }
                if (root.getRight()!=null){
                    return fa(root.getRight(),value);
                }
                return null;
      }
}
