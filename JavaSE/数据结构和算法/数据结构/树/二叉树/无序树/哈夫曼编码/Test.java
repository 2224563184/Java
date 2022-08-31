package 数据结构和算法.数据结构.树.二叉树.无序树.哈夫曼编码;

import java.util.*;

public class Test {
    static byte and[];
    static HashMap<Byte,String>  hashMap=new HashMap();
    static  StringBuilder  stringBuilder=new StringBuilder();

    public static void main(String[] args) {
        byte[] bytes = {1, 2, 0, 4, 5,9,10};
        Node root = test(bytes);
          yu(root);
        byte[] zip = zip(bytes);
        byte[] decode = decode(hashMap, zip);
        System.out.println(Arrays.toString(decode));


    }
    public static Node test(byte[] arr){  //哈夫曼树

        HashMap<Byte, Integer> map = new HashMap<>();
//   统计每个数据出现的次数
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
            int id = map.get(arr[i]); //根据键,输出值
            map.put(arr[i],id+1 );
        }else {
            map.put(arr[i],1 );
        }
        }
//    生成结点:
//    1.出现次数为结点权
//    2.数据不变
//    3.每个结点放入队列
        List<Node<Byte>> list = new ArrayList<>();
        Set<Byte> keySet = map.keySet();
        for (Byte key : keySet) {
//            键:数据,
//            值:结点权
            Node<Byte> objectNode = new Node(new Byte(key));  //设置结点的数据
            objectNode.setValue(map.get(key));                                        //设置结点权
            list.add(objectNode);            //结点存入队列
        }

//     4.遍历队列,生成哈夫曼树
          while (list.size()>1) {
              Collections.sort(list);
              Node<Byte> left = list.get(0);
              Node<Byte> rigft = list.get(1);
              Node sum = new Node(left.getValue()+rigft.getValue(),null); //           总和结点

              sum.setLeft(left);
              sum.setRight(rigft);

              list.add(sum);
              list.remove(left);
              list.remove(rigft);
          }

           Node root = list.get(0);       //哈夫曼树

          and=arr;
           return  root;
    }
//    builder:      路径记录
//    direction:   方向

public  static void ud(Node  nodeCode,String  code,StringBuilder stringBuilder){  //压缩数组

        StringBuilder newString =new StringBuilder(stringBuilder);  //添加历史记录

                                      newString.append(code);                                              //添加记录

                                   if (nodeCode!=null){

                            if (nodeCode.getBy()==null){

                                 ud(nodeCode.getLeft(),"0",newString);         //左递归
                                ud(nodeCode.getRight(),"1",newString);    //右递归

                            }else {
                                hashMap.put(nodeCode.getBy(),newString.toString()); //转换为String并且将哈夫曼二进制存入
                            }
                        }

}
public static byte[] zip(byte[]bytes){
            StringBuilder stringBuilder=new StringBuilder();

    for (byte b : bytes) {
        stringBuilder.append(hashMap.get(b));
    }
    int len;

    if (stringBuilder.length()%8==0){
        len=stringBuilder.length()/8;
    }else {
        len=stringBuilder.length()/8+1;
    }

    byte[] arr = new byte[len];

    String toString = stringBuilder.toString();
    int j=0;
    int k=0;
    while (true){

        if (j+8<toString.length()){
            String substring = toString.substring(j, j + 8);
            arr[k]=(byte) Integer.parseInt(substring,2);
        }else {
            String substring = toString.substring(j);
            arr[k]=(byte) Integer.parseInt(substring,2);
            break;
        }
        j+=8;
    }

return arr;
}
public static  void  yu(Node root){
        if (root==null){
          return;
        }
        ud(root.getLeft(),"0",stringBuilder);
        ud(root.getRight(),"1",stringBuilder);

}
public  static String byteTostring(boolean isPepair,byte b){
        int tmp=b;
        if (isPepair){
            tmp |=256;
        }

    String string = Integer.toBinaryString(tmp);
        if (isPepair){
            return string.substring(string.length()-8);
        }else {
            return  string;
        }
}

public static byte[] decode(Map<Byte,String>huffmanCode,byte[]huffmanBytes){
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < huffmanBytes.length; i++) {
    byte b=huffmanBytes[i];
    boolean flg=false;
    if (i==huffmanBytes.length-1){
        flg=true;
    }
    stringBuilder.append(byteTostring(!flg,b));
    }
    Map<String, Byte> map =new HashMap<>();
    ArrayList<Byte> bytes = new ArrayList<>();

    for (Map.Entry< Byte,String> entry : huffmanCode.entrySet()) {
       map.put(entry.getValue(),entry.getKey());
    }

    for (int i = 0; i < stringBuilder.length(); i++) {
        int count =i;
        boolean flg=true;
        Byte   b=null;

        while (flg){
            String key = stringBuilder.substring(i, i + count);
            Byte  aByte = map.get(key);

                if (b==null){
                        count++;
                }else {
                    flg=false;
                }

                  }
                    bytes.add(b);
                    i+=count;
                }
                        byte[] buff = new byte[bytes.size()];

                    for (int i = 0; i < buff.length; i++) {
                   buff[i]=(byte)bytes.get(i);
                }
                    return buff;
}

}