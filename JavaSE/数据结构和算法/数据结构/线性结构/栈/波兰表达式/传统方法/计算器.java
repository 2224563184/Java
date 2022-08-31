package 数据结构和算法.数据结构.线性结构.栈.波兰表达式.传统方法;

import java.util.Stack;


//   不同优先级的情况先,  先计算优先的再保存进去
//   同等级的情况下, 先计算   "-"或者"/",再保存
public class 计算器 {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        Stack<Character> characters = new Stack<>();
          String str="20/2-5+5"; //   结果:  5
        int idex=0;  // 截取记录
        int i=0;       //截取头
        char c='a';
        int op=0;         //截取到的数字
        int so=0;
        while (idex<=str.length()) {

//            在没有往前推之前, 截取这个数字
          if (idex>0){
               op= Integer.parseInt(str.substring(i, idex)); // 当前数字
//           20/2-5

          }

          if (idex==str.length()) {
              char[] chars = str.toCharArray();
              c=chars[str.length()-1];
          }else {
              c = str.substring(idex, idex + 1).charAt(0); //当前符号
          }

//            判断是否为符号,是符号, 那就往前推
            if (check2(c)){

//               如果数字栈和符号栈为空, 那就直接塞进去
               if (integers.size()==0&&characters.size()==0){
                   integers.add(op);
                   characters.add(c);
//             如果数字栈和符号栈为空, 那就比较当前的符号和取出的符号比较优先级
//               取出数 xxx 当前数
               }else {
//                   取出数字
                   int i7 = integers.pop();
//                   取出符号
                   char c7 = characters.pop();
//                   比较优先级
                   if (distinguish(c7)>distinguish(c)){
                       int sum = sum(i7, op, c7);
                       integers.push(sum);
                       characters.add(c);
                   }else if (distinguish(c7)==distinguish(c)){
                              int sum =sum(i7,op,c7);
                              integers.add(sum);
                              characters.add(c);
                   }

               }
                idex++;
               i=idex;
            }

            if (idex==str.length()){
                char[] chars = new char[1];
                chars[0]=c;
                String s = new String(chars);
                int sd = Integer.parseInt(s);

                int integer = integers.pop();

                char c1 = characters.pop();

              if (c1=='-') {
                  int sum = integer - sd;
                  integers.add(sum);
              }else if (c1=='/'){
                  int sum = integer / sd;
                  integers.add(sum);
              }else {
                  integers.add(integer);
                  characters.add(c1);
                  integers.add(sd);
              }
            }
            idex++;
            op++;
            so++;
        }

    while (integers.size()>0){
        int integer = integers.pop();   //取出的数字

        if (characters.size()>0) {
          char  cha = characters.pop();   //取出的符号
            System.out.println(integer+"\t"+cha);
        }else {
            System.out.println(integer);
        }


    }

    }


    //    区分等级
    public  static int distinguish(char ch) {
        if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return -1;
        }
    }

    //     检查符号
    public static char check(char ch) {

        if (ch == '+') {
            return '+';
        } else if (ch == '-') {
            return '-';
        } else if (ch == '*') {
            return '*';
        } else if (ch == '/') {
            return '/';
        } else {
            return 'a';
        }
    }

    public static boolean check2(char ch) {

        if (ch == '+') {
            return true;
        } else if (ch == '-') {
            return true;
        } else if (ch == '*') {
            return true;
        } else if (ch == '/') {
            return true;
        } else {
            return false;
        }
    }
//    总和
//    取出: Take     当前:current
    public static int sum(int Take ,int  current,char ch){
        if (ch == '+') {
            return Take+current;
        } else if (ch == '-') {
            return Take-current;
        } else if (ch == '*') {
            return Take*ch;
        } else if (ch == '/') {
            return Take/current;
        } else {
            return -1;
        }

    }
}



