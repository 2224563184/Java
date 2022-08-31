package 数据结构和算法.算法.排序.分治排序.归并排序;

public class ts {
    public static void main(String[] args) {
        int arr[]=new int[100000];
        for (int i = 0; i < arr.length; i++) {
            int random =(int) (Math.random()*1000);
            arr[i]=random;
        }
          int tmp[]=new int[arr.length];
        System.out.println();
          sort(arr,0, arr.length-1,tmp);



    }
    public static void sum(int array[],int left ,int right,int mid,int tmp[]){
            int t=0;
            int i=left;                //左组头
            int j=mid+1;       //右组头


//        两组没过界的情况下
        while (i<=mid&&j<=right){

            if (array[i]<=array[j]){  //            将小的元素存入数组
                tmp[t]=array[i];
                t++;
                i++;
            }else {
                tmp[t]=array[j];
                t++;
                j++;
            }
            }

//        其中一组过界了
        while (i<=mid){    //看一眼左组有没有剩余的
            tmp[t]=array[i];
              t++;
             i++;
        }

        while (j<=right){  // 右组同上
            tmp[t]=array[j];
            t++;
            j++;
        }

        int tmpindex=left;
        int k=0;
        int p=t;
        while (tmpindex<=right){
            array[tmpindex]=tmp[k];
            k++;
           tmpindex++;
        }


    }
    public  static void sort(int []arr,int left,int right,int []tmp){
        int mid=(left+right)/2;
                  if (left>=right){
                      return;
                  }

        sort(arr, left, mid, tmp);

        sort(arr, mid+1, right, tmp);

        sum(arr,left,right,mid,tmp);

    }

}
