package 正则表达式.连续;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {

        String sd="0123-aA6Bhi+*/shuo";

        Pattern compile = Pattern.compile("A-Z");
        Matcher matcher = compile.matcher(sd);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
