package 数据结构和算法.算法.排序算法.选择排序.简单选择;

public class Test {
    public static void main(String[] args) {
        int arr[]={3,1,5,4,6,8,7,10,9,2};


        int tem=0;   //最大值的索引

        for (int j = 1; j <= arr.length; j++) {
            for (int i = 1; i <= arr.length-j; i++) {
                if (arr[tem] < arr[i]) {
                    tem = i;
                }
            }
//        最大值
            int ts = arr[tem];
//       最后值赋值给最大值
            arr[tem] = arr[arr.length - j];
//        最大值赋值给最后值
            arr[arr.length - j] = ts;
            tem = 0;

        }

        add(arr);

    }
    private static  void add(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
