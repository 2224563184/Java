package 数据结构和算法.算法.排序算法.交换排序.快速;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
      int []arr={5,4,9,50,2,7,6};
      quickSort(arr,0, arr.length-1);

        String s = Arrays.toString(arr);
        System.out.println(s);
    }
    public static void quickSort(int []arr,int left,int right) {

        if (left>right){
            return;
        }

        int i = left;     //左索引
        int j = right; //右索引
        int base = arr[i]; //中轴值

        while (i != j) {

            while (arr[j] >= base && i < j) { //      右指针<中心轴,右指针--
                j--;
            }

            while (arr[i] <= base && i < j) {  //   左指针<中心轴,左指针++
                i++;
            }

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

        }

              arr[left]=arr[i];
              arr[i]=base;

              quickSort(arr,left,i-1);

              quickSort(arr,j+1,right);

    }
}
