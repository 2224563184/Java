package 数据结构和算法.数据结构.树.二叉树.哈夫曼树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Huffman {
    public static void main(String[] args) {
        int arr[]={9,5,4,1,3,2,10,20};
 createhuffman(arr);
    }
    public static Node  createhuffman(int arr[]){
        List<Node> nodes = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            nodes.add(new Node(arr[i]));
        }

             while (nodes.size()>1){
                 Collections.sort(nodes);   //数组重新排序
//                 两个最小值
                 Node leftnode = nodes.get(0);
                 Node rightnode = nodes.get(1);
//                 两数之和
                 Node sum = new Node(leftnode.getValue() + rightnode.getValue());

             }
return null;
    }
}
