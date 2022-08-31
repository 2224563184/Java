package 数据结构和算法.算法.排序算法.插入排序.希尔排序;

public class 希尔 {
    public static void main(String[] args) {
        int [] arr={0,1,7,4,2,8,6,3,5,9,10,15,20,14,13,11,12,19,18,17,16};
       shellSort(arr);
       op(arr);
       ui(arr);
        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+"\t");
        }
        int [] arr2={0,1,7,4,2,8,6,3,5,9,10,15,20,14,13,11,12,19,18,17,16};
        a(arr2);
        b(arr2);
        c(arr2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    public static void shellSort(int[] arr) {
        int tmp = 0;
        int k=0;
        for (int i = 5; i < arr.length; i++) {
            for (int j = i - 5; j >= 0; j -= 5) {
                if (arr[j] > arr[j + 5]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 5];
                    arr[j + 5] = tmp;
                }
                k++;
            }
        }
        System.out.println("shellSort="+k);
    }

    public static void op(int []arr) {
        int tmp = 0;
        int k=0;
        for (int i = 2; i < arr.length; i++) {
            for (int j = i - 2; j >= 0; j -= 2) {
                if (arr[j] > arr[j + 2]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = tmp;
                }
                k++;
            }
        }
        System.out.println("op="+k);
    }
    public static void ui(int[]arr){
        int tmp = 0;
        int k=0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j -= 1) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
                k++;
            }
        }
        System.out.println("ui="+k);
    }
private static void   a(int arr[]){
        int k=0;

        for (int i = 0; i <arr.length/2; i++) {
            if (arr[i] > arr[i + arr.length/2]) {
                int tmp = arr[i];
                arr[i] = arr[i + 5];
                arr[i + 5] = tmp;
            }
            k++;
        }
    System.out.println(k);
}



private static  void  b(int arr[]){
    int k=0;
    for (int n = 1; n < arr.length-2; n++) {
        for (int i = 0; i < n; i+=2) {
            if (arr[i] > arr[i + 2]) {
                int tmp = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = tmp;
            }
            k++;
        }
    }
    System.out.println(k);
}
private static  void  c(int arr[]){
    int k=0;
    for (int n = 0; n < arr.length-1; n++) {
    for (int i = 0; i<n; i++) {
        if (arr[i]>arr[i+1]){
            int tmp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1]=tmp;
        }
        k++;
    }
    }
    System.out.println(k);
}

}
