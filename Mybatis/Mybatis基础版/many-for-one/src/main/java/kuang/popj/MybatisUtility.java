package Levelcache1.popj;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtility {
   private static SqlSessionFactory factory=null;
    static {
        InputStream in=null;

        try {
          in=  Resources.getResourceAsStream("MappUsers.xml");
             factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (in!=null){
                    in.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }
    public static SqlSession getFactory(){
        return factory.openSession();
    }
}
