package 控制结构;

import java.util.Scanner;

public class switch列表循环 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int x=sc.nextInt();

          switch (x){
              case 1:
                  System.out.println("一");
                  break;
              case 2:
                  System.out.println("二");
                  break;
              case 3:
                  System.out.println("三");
                  break;
              case 4:
                  System.out.println("四");
                  break;
              case 5:
              default:
                  System.out.println("请输入");
              case 6:
                  break;
//                  System.exit(6);
          }
    }
}
