package 正则表达式.基础;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) throws Exception{
//        定义一个超长的字符串
        String str = add();
//       拼接文本
        StringBuilder builder = new StringBuilder();
//        临时变量
        String sd="";
//         创建模式对象   ,
//        Pattern compile = Pattern.compile("[1964]+");     模糊查询
         Pattern compile = Pattern.compile("1964");//        具体查询
//         匹配器对象
        Matcher matcher = compile.matcher(str);
//         开始匹配
        int i=0;
        while (matcher.find()){
            builder.append("找到:");
            builder.append(matcher.group());
            builder.append("\n");
            i++;
        }
        System.out.print(builder);
        System.out.println("总数量:"+i);

    }
    private static String add(){
        StringBuilder  builder =null;
        FileReader fileReader=null;
        try {
            fileReader = new FileReader("D:\\Java\\JavaSE\\Java高级\\src\\正则表达式\\字符串.txt");
            char[] ch=new char[1024];
            int len;
            builder = new StringBuilder();
            while ((len=fileReader.read(ch))!=-1){
                builder.append(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                    if (fileReader!=null)
                    fileReader.close();
                } catch (IOException e) {

                }
            }
        String string = builder.toString();
        return string;
        }
    }

