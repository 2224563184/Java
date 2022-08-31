package 数据结构和算法.数据结构.图;

public class Test {
    public static void main(String[] args) {

        int  n   =5;    //结点的总数
        String[]    Vertexs={"A",    "B",   "C",  "D",  "E"};
        Graph graph = new Graph(5);

        for (String value : Vertexs) {
            graph.insertVertex(value);  // 插入结点
        }

//        添加边
        graph.insertEdg(0,1,1);
        graph.insertEdg(0,2,1);
        graph.insertEdg(1,2,1);
        graph.insertEdg(1,3,1);
        graph.insertEdg(1,4,1);
//        graph.showGraph();
//         graph.dfs();  //深度优先搜索
        System.out.println();
        graph.bfs();     //广度优先搜索


    }

}
