package 数据结构和算法.算法.排序算法.基数排序;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*1000);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        int and = and(arr);
      radix(arr,and);
        ArrayList<Object> objects = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }


    }
    public  static void radix(int arr[],int Max) {


            int[][] bucket = new int[10][arr.length];     // 定义10个桶
            int[] record = new int[10];                          // 定义记录桶

            for (int p = 0,n=1; p <=Max; p++,n*=10) {

//        遍历数组
            for (int i = 0; i < arr.length; i++) {
                int j = arr[i] / n % 10;          //个位数 索引,哪个桶
                int k = record[j];             // 查看桶记录. 桶索引
                bucket[j][k] = arr[i];         //放入 指定桶的指定索引
                record[j]++;                   // 更新桶记录
            }

            int index = -1;
//        遍历桶记录
//
            for (int i = 0; i < record.length; i++) {
                int j = record[i];              //桶数量
                if (j > 0) {                         //有记录的情况下  根据桶数量遍历
                    for (int k = 0; k < j; k++) {
                        index += 1;
                        arr[index] = bucket[i][k];          //k: 桶索引
                        bucket[i][k]=0;

                    }
                }
                record[i]=0;
            }


        }
    }




    public static int and(int []arr){
        int Max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Max>arr[i]){
                Max=arr[i];
            }
        }

        int length = (" " + Max).length();

        return length ;
    }


}
