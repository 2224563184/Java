package 正则表达式.多选一;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class psvm {
    public static void main(String[] args) {
        String sd="54645-6hi+*/shuo";
        Pattern compile = Pattern.compile("[+-/*]");
        Matcher matcher = compile.matcher(sd);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
