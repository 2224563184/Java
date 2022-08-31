package 数据结构和算法.算法.查找算法.插值查找;

public class Test {
    public static void main(String[] args) {

        int arr[]={1,2,9,10,20,30,31,55,200};
        int select = select(arr, 0, arr.length - 1, 9,0);
        System.out.println(select);

    }
    public  static  int select(int arr[],int left,int right,int sear,int i ){

      if(left >right||sear<arr[0]||sear>arr[arr.length-1]){
         return -1;
      }
//   目标值值:  sear
//   定位值索引
      int mid=left+(right-left)*(sear-arr[left])/(arr[right]-arr[left]);
//    定位值
      int midValue=arr[mid];

//      目标值>定位值, 向右走
      if (sear>midValue){
          return select(arr,mid+1,right,sear,i);

//       目标值<定位值, 向左走
      }else if (sear<midValue){
          return select(arr,left,mid-1,sear,i);
      }else {
          return mid;
      }

    }

}
