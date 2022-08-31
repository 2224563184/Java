package 控制结构;

public class for循环 {
    public static void main(String[] args) {
//普通 for循环:
        int x=20;
        for (int i=0;i<x;i++){       //从指定的位置开始循环,循环到满足判断条件则结束循环
        }

//增强for循环:
        int [] X=new int[]{10,20,30};//效果同上,只是使用方法和兼容不容
        for (int i : X) {
        }
    }
}
