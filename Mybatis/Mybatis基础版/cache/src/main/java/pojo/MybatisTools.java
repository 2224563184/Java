package pojo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTools {
  private static InputStream inputStream =null;
  private static SqlSessionFactory build =null;

    static {
        try {
             inputStream = Resources.getResourceAsStream("Mapper.xml");
             build = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e){
             e.printStackTrace();
        }finally {
            try {
                if (inputStream!=null)
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static SqlSession getconne(){
       return build.openSession();
    }
}
