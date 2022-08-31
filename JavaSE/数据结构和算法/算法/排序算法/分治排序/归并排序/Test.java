package 数据结构和算法.算法.排序算法.分治排序.归并排序;

public class Test {

    public static void main(String[] args) {
        int arr[] = {4,5,7,8,1,2,3,6};
        mergeSouc(arr,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public  static void merge(int []arr,int L1,int R1,int L2,int R2){

/*                 L1: 左组头
                    R1:左组尾

                    L2:右组头
                    R2:右组尾
* */
        int tmp[]=new int[R2+1-L1]; // 辅助数组
        int index=0;
        int l=L1;
        while (index!=tmp.length){

                if (L1>R1){                                   //如果左组头超出左组尾
                    tmp[index]=arr[L2++];         //辅助数组指向左组尾

                }else  if (L2>R2){                         //如果右组头超出右组尾
                        tmp[index]=arr[L1++];      //辅助数组指向右组尾

                }else {
                    if (arr[L1]<=arr[L2]){                  //如果左组头<右组头
                        tmp[index]=arr[L1++];

                    }else {
                        tmp[index]=arr[L2++];
                    }
                }
                    index++;
        }
        System.arraycopy(tmp,0,arr,l,R2-l+1);
    }

//    分解
     public static void mergeSouc     (int arr[],int L,int R){
                        if (L>=R){
                            return;
                        }
                            int mid =(L+ R) / 2;

                        mergeSouc(arr,L,mid);                  //左递归

                        mergeSouc(arr,mid+1,R);       //右递归

                         merge(arr,L,mid,mid+1,R);    //排序算法
     }
}
