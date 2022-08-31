package 数据结构和算法.数据结构.树.二叉树.无序树.二叉树;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }



        pre(0, arr);

        }
public static  void pre(int index,int arr[]){
    if (index>= arr.length||arr.length==0){
        return;
    }
    System.out.println(arr[index]);

        if (index<arr.length){
            pre(index*2+1,arr);
        }

        if (index< arr.length){
            pre(index*2+2,arr);
        }
}
    }


