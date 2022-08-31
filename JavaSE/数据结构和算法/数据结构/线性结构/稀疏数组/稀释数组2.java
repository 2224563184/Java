package 数据结构和算法.数据结构.线性结构.稀疏数组;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class 稀释数组2 {
    public static void main(String[] args)throws Exception {
//        读取稀疏数组
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("X:\\Users\\it\\Desktop\\稀疏数组.txt"));
        Object object = inputStream.readObject();
        int[][] arr=(int[][]) object;

        int[][] and = new int[arr[0][0]][arr[0][1]];
        System.out.println("行"+and.length);
        System.out.println("列"+and[and.length-1].length);

        for (int i = 1; i < arr.length; i++) {
           int  out1=   arr[i][0];
            int   out2=arr[i][1];
            int   va=arr[i][2];
            and[out1][out2]=va;
        }

        for (int i = 0; i < and.length; i++) {
            for (int k = 0; k < and[i].length; k++) {
                System.out.print(and[i][k]);
            }
            System.out.println();
        }

    }
}
