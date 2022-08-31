package 数据结构和算法.算法.排序算法.插入排序.简单插入;

public class 直接插入 {
    public static void main(String[] args) {
        int arr[] = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            double random = Math.random();
            arr[i]=(int)(random*1000);
        }

        int exit = exit(arr);  //返回未排序索引
        long sta = System.currentTimeMillis();
        while (exit<arr.length) {
            if (exit != -1) {
                if (max(arr, exit) != -1) {
                    int Minidex = max(arr, exit);// >最小值索引
                    int tmp = arr[exit];                 // 未排序数据
//            右移
                    so(Minidex, exit, arr);
                    arr[Minidex] = tmp;
                }
            }
            exit++;
        }
        long end = System.currentTimeMillis();
        System.out.println("插入="+(end-sta));

        long millis = System.currentTimeMillis();


        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+"\t");
        }
    }

    //    >最小值索引     参数: 未排序索引头
    private static int max(int[] arr, int Minindex) {
        for (int i = 0; i <Minindex; i++) {
            if (arr[i] > arr[Minindex]) {
                return i;
            }
        }
        return -1;
    }

    //    未排序头右移    i: >最小值索引,  j:未排序索引头
    private static void so(int i, int j, int arr[]) {
        for (int k = j; k >i; k--) {
            arr[k]=arr[k-1];
        }

    }

    //    插入
    private static void or(int[] arr, int index, int a) {
        arr[index] = a;
    }


//    判断是否已经排序好了
    private static int exit(int[] arr) {
         int a=0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1] ) {
                if (i == arr.length - 2) {
                    return -1;
                }
            }else {
                a= i;
                break;
            }

        }
           return a+1;

    }
}