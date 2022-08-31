package 正则表达式.模糊查询;

import 正则表达式.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 模糊查询 {
    public static void main(String[] args) {
        String st= str.add();

//        创建正则表达式(模式)对象
        Pattern pattern = Pattern.compile("\\d\\d\\d\\d");

//        创建匹配对象
        Matcher matcher = pattern.matcher(st);
//        开始匹配
        String sd="";
    int i=0;
   while (matcher.find()){
//       System.out.println(matcher.group());
   }

        Pattern compile = Pattern.compile("1..4");
        Matcher matcher1 = compile.matcher(st);

        while (matcher1.find()){
            System.out.println(matcher1.group());
        }

    }
}
