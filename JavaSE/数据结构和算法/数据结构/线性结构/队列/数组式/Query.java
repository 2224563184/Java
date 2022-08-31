package 数据结构和算法.数据结构.线性结构.队列.数组式;

public class Query<E> {
    Object [] arr;   // 数组
    int add;          //   添加索引
    int remo;      //   删除索引
    int  size;      //     当前数量
    int  Max;    //      最大容量
    public  Query (int max){
         this.arr=new Object[max];
        this.Max=max;
        add=-1;
        remo=-1;
    }
//     判断塞满
    private boolean ifMax(){
        if (size==Max){  //当前数量==最大容量
         return true;
        }
        return false;
    }

//    判断过界
    private boolean ArrayIndex(int add){
        if (add==Max-1){
            return true;
        }
        return false;
    }

    public  void  add(E obj){
        if (ifMax()){
            throw  new RuntimeException("满了");
        }
//        虽然过界了,但是队列没有塞满
//         索引从0开始继续塞
        if (ArrayIndex(add)){  // 过界
            if (!ifMax()) {
                add = -1;
                add++;
                arr[add]=obj;
                size++;
                return;
            }
        }
//        正常添加
        add++;    //添加索引
        arr[add]=obj;
        size++;   //当前数量
    }
    public  E  get(){
//        判断当前数量是空
        if (size==0){
            throw new RuntimeException("空队列");
        }

        if (ArrayIndex(remo)){
            if (size>0){
                remo=-1;
                remo++;
                return (E)arr[remo];
            }
        }
            remo++;
        E o = (E)arr[remo];
        size--;
        return o;
    }

}
