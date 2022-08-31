package 数据结构和算法.算法.查找算法.插值查找;

public class Demo {
    public static void main(String[] args) {
           int arr[]={1,2,3,4,5,6,7,8,9,10};
           op(arr,0, arr.length-1);
    }
    public   static void  op(int arr[],int min,int max){
        int adc=9;
//        left+(right-left)*(fidval-arr[left])/(arr[right]-arr[left])
//        左指针+(右指针-左指针)*(目标值-左指针的值)/(右指针的值-左指针的值)
         int i=0;
        while (true){
            i++;
            int mid= min+(max-min)*(adc-arr[min])/(arr[max]-arr[min]);
            if (arr[mid]==adc){
                System.out.println("执行次数="+i);
                System.out.println("索引位置="+mid);
                break;
            }

            if (arr[mid]<adc){    //中间值<目标值
                min=mid;
            }else {
                max=mid;
            }
    }

}}
