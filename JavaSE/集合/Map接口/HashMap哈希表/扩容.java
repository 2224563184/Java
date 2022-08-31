package 集合.Map接口.HashMap哈希表;

import java.util.ArrayList;

public class 扩容 {
    public static void main(String[] args) {
        ArrayList add = add();
        int [] o = (int[])add.get(0);
        System.out.println(o[0]);

    }
 public static ArrayList add(){
     int[] ints = new int[1];
     ints[0]=9999;
     ArrayList<Object> objects = new ArrayList<>();
     objects.add(ints);
     return objects;
 }
}




