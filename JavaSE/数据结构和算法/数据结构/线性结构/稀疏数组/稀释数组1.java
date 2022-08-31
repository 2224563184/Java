package 数据结构和算法.数据结构.线性结构.稀疏数组;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class 稀释数组1 {
    public static void main(String[] args) throws Exception {


//      问题源

        int[][] arr = new int[10][10];
        arr[0][2]=1;
        arr[1][3]=2;
        arr[9][9]=2;

//        解决方案

//        遍历二位数组,记录!默认值
         int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]!=0){
                    sum+=1;
                }
            }
        }

        int[][] ints = new int[sum + 1][3];
        ints[0][0]=10;
        ints[0][1]=10;
        ints[0][2]=sum;

         int idex=1;
//         遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]!=0){
                  ints[idex][0]=i;
                    ints[idex][1]=j;
                    ints[idex][2]=arr[i][j];
                    idex++;
                }
            }
        }
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("X:\\Users\\it\\Desktop\\稀疏数组.txt"));
                objectOutputStream.writeObject(ints);
                objectOutputStream.flush();
                objectOutputStream.close();

    }
}
