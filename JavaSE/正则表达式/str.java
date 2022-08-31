package 正则表达式;

import java.io.FileReader;
import java.io.IOException;

public class str {
    public static String add(){
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
    }}
