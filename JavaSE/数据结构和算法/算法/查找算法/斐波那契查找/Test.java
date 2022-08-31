package 数据结构和算法.算法.查找算法.斐波那契查找;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
         int []arr=new int[100000];

        for (int i = 0; i < arr.length-1; i++) {
            arr[i+1]=i;
        }
//  查找5
        int sd = sd(arr, 5, arr.length);
        System.out.println(sd);
//        System.out.println(Arrays.toString(f(20)));
    
    }
    public  static int[]  f(int length){
           int f[]=new int[length];
           f[0]=1;
           f[1]=1;
        for (int i = 2; i < f.length; i++) {
            f[i]=f[i-1]+f[i-2];
        }
        return f;
    }

public static int sd(int[] arr, int key,int length){
//        定义最左边的索引
            int low=0;
//          定义最右边的索引
            int hight=arr.length-1;
//          定义斐波那契数组的索引,从0开始
            int k=0;
//          定义一个定位索引,初始化0
            int mid=0;
//           接收斐波那契数组
          int []f=f(length);
//         找分割点，记录该索引
          while (hight>f[k]-1){
              k++;
          }


//           扩充数组
          int []tmp=Arrays.copyOf(arr,f[k]);

//            更新数组, 扩充区的元素都是原来数组的最后元素
    for (int i = hight+1; i < tmp.length; i++) {
           tmp[i]=arr[hight];
    }
    // [1, 1, 2, 3, 5, 8, 13, 21, 0,   0,   0,  0,  0,  0,  0]
// [1, 1, 2, 3, 5, 8, 13, 21, 21,21,21,21,21,21,21]

    while (low<=hight){      //原数组索引<原数组容量
        mid=low+f[k-1]-1;   //原数组索引+斐波那契-1
//      f[k-1]+f[k-2]=f[k];

        if (key<tmp[mid]){//            目标值<定位值，
            hight=mid-1;               //  更新数组最大索引
            k--;                                //  斐波那契索引-1
        }else if (key>tmp[mid]){ //     目标值>定位值，
            low=mid+1;              //      更新数组最大索引
            k-=2;                          //       斐波那契索引-2
        }else {
            if (mid<=hight){      //      定位索引==数组索引
                return mid;          //
            }else {
                return hight;
            }
        }
    }

return -1;
}

}
