package 数据结构和算法.数据结构.树.二叉树.哈夫曼解压;

import java.util.*;

public class Test {
   static Map<Byte,String> huffmanCode=new HashMap<>();
    public static void main(String[] args) {
        byte[] bytes ={12, 0, 0};

        huffmanCode.put(new Byte((byte) 0),"010");
        huffmanCode.put(new Byte((byte) 1),"011");
        huffmanCode.put(new Byte((byte) 2),"100");
        huffmanCode.put(new Byte((byte) 4),"101");
        huffmanCode.put(new Byte((byte) 5),"100");
        huffmanCode.put(new Byte((byte) 9),"111");
        huffmanCode.put(new Byte((byte) 10),"00");

        byte[] decode = decode(huffmanCode, bytes);
        System.out.println(Arrays.toString(decode));


    }

    public static    String bytetoString(byte b){  // 输出二进制数据
          int tmp=b;
          if (tmp>0){
            tmp |= 256;
              String toBinaryString = Integer.toBinaryString(tmp);
              return toBinaryString.substring(toBinaryString.length()-8);
        }
       return    Integer.toBinaryString(tmp);
    }
    public static  byte[] decode(Map<Byte,String> huffmanCode,byte[] huffmanByte){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < huffmanByte.length; i++) {
            byte b=huffmanByte[i];
                stringBuilder.append(bytetoString(b));
        }
        HashMap<String, Byte> map = new HashMap<>();

        Set<Map.Entry<Byte, String>> entries = huffmanCode.entrySet();
        for (Map.Entry<Byte, String> entry : entries) {
            map.put(entry.getValue(),entry.getKey());
        }

        ArrayList<Byte> bytes = new ArrayList<>();
        for (int i = 0; i < stringBuilder.length(); i++) {
            int count=i;
            Byte b = null;
            boolean flg=true;
            while (flg){

                String key = stringBuilder.substring(i, i + count);
                b=map.get(key);

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
             buff[i]=bytes.get(i);
        }

        return buff;
    }
}

