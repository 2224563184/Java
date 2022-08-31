package 数据结构和算法.算法.查找算法.二分查找;

public class Terst {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};



          int min=0;                           //索引头
        int max= arr.length-1;        //索引尾
        int  adc=10;
        int i=0;

                        while (true){
                            i++;
                            int mid= (min+max)/2;
                            if (arr[mid]==adc){
                             System.out.println("执行次数="+i);
                                System.out.println("索引位置="+mid);
                             break;
                         }

                         if (arr[mid]<adc){    //中间值<目标值
                             min=mid+1;
                         }else {
                             max=mid-1;
                         }


                        }

        }


    }

