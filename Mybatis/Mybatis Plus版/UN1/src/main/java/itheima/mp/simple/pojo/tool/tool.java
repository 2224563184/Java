package itheima.mp.simple.pojo.tool;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.InputStream;

public class tool {
   static SqlSessionFactory build=null;

    static {
        InputStream inputStream=null;
        try {
             inputStream=Resources.getResourceAsStream("application.xml");
             build = new MybatisSqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e){
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            }catch (Exception k){
                k.printStackTrace();
            }
        }
    }

    public static SqlSession getsqlSession(){
        return build.openSession();
    }
}
