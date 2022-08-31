package 正则表达式.分组;

import 正则表达式.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DEmo {
    public static void main(String[] args) throws Exception{
        String st = str.add();

        String sql="(//d)(//d)";
        Pattern pattern = Pattern.compile(sql);
        Matcher matcher = pattern.matcher(st);
        while (matcher.find()){
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }


    }
}
