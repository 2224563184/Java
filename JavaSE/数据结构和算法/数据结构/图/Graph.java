package 数据结构和算法.数据结构.图;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//无向图
public class Graph {
    private ArrayList<String>vartexList;
    private int[][]   edgee;
    private int munofEdges;  //边的数量

    private  boolean[]    isVisited;

    //    初始化矩阵,  初始化数组
    public Graph(int n) {
        edgee=new int[n][n];
        vartexList=new ArrayList<String>(n);
        munofEdges=0;
        isVisited=new boolean[n];
    }

    // 插入顶点
    public  void  insertVertex(String str){
        vartexList.add(str);
    }

    //    添加边
    public  void  insertEdg(int v1,   int v2,   int weight  ){
        edgee[v1][v2]=weight;
        edgee[v2][v1]=weight;
        munofEdges++;
    }


    //结点数量
public int getvaVrtexList(){
        return vartexList.size();
}
//边的数量
    public int getmunofEdges(){
        return munofEdges;
    }
//    得到节点
    public String getValue(int value){
        return vartexList.get(value);
    }

//    返回矩阵的权值
    public int getEdgee(int v1,  int v2){
        return edgee[v1][v2];
    }

//    显示矩阵
    public void showGraph(){
        for (int i = 0; i < edgee.length; i++) {
            System.out.println(Arrays.toString(edgee[i]));
        }
    }

    public  int   getFirstNeighbor(int i){
        for (int j = 0; j < vartexList.size(); j++) {
            if (edgee[i][j]>0)    //遍历  矩形
                return j;
        }
        return -1;
    }

    //  根据前一个邻接结点的索引来获取下一个邻接结点
    public int getNextNeighbor(int v1,   int v2){
        for (int j = v2+1; j < vartexList.size(); j++) {
            if (edgee[v1][j]>0)
                return j;
        }
        return -1;
    }

    //  查看结点总数量
    public int getNumofVertex(){
        return vartexList.size();
    }

    //      深度优先遍历
//       i 第一次就是0
    public  void  dfs(boolean[]    isVisited,    int i){
//        首先输出该结点
        System.out.print(getValueByIndex(i)+"->");
//        将结点设置为已经访问
        isVisited[i]=true; //布尔数组

//        查找结点i的第一个邻接结点w
        int w = getFirstNeighbor(i);
        while (w!=-1){    //说明有
            if (!isVisited[w]){
                dfs(isVisited,  w);
            }
//        如果已经访问过了
//         i:上一个遍历索引
//       w: 遍历索引
            w=getNextNeighbor(i,  w);
        }

    }

    private String getValueByIndex(int i) {
        return vartexList.get(i);
    }

    //对dfs重载,   遍历所有的结点,  进行dfs
    public void dfs (){

        for (int i = 0; i < vartexList.size(); i++) {
//            遍历记录数组
            if (!isVisited[i]){
                dfs(isVisited,  i);
            }
        }
    }

    public  void  bfs(boolean[]   isVisited,      int i  ){
        int u;
        int w;
        LinkedList<Object> queue = new LinkedList<>();
        System.out.print(getValueByIndex(i)+"->");
        isVisited[i]=true;
        while (!queue.isEmpty()){
          u =  (Integer)queue.removeFirst();
         w = getFirstNeighbor(u);
         while (w!=-1){
             if (isVisited[w]){
                 System.out.print(getValueByIndex(w)+"->");
                 isVisited[w]=true;
                 queue.add(w);
             }
             w=getNextNeighbor(u,w);
         }
        }
    }
    public void  bfs(){
        for (int i = 0; i < getNumofVertex(); i++) {
            if (!isVisited[i]){
                bfs(isVisited,i);
            }
        }
    }
}
