package 数据结构和算法.数据结构.树.二叉树.数组存二叉树;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        mode(arr,0);

    }
    public static void mode(int arr[],int index){
        if (index>=arr.length||arr.length==0){
            return;
        }
        System.out.println(arr[index]);
        mode(arr,index*2+1);
        mode(arr,index*2+2);
    }
}
