package 集合.Map接口.配置;

import java.io.FileInputStream;
import java.util.Properties;

public class Properties_ {
    public static void main(String[] args)throws Exception {
        Properties pro = new Properties();
        pro.load(new FileInputStream("路径"));

//       配置类是线程安全的,  但是不建议同时写入和读取
    }

}
