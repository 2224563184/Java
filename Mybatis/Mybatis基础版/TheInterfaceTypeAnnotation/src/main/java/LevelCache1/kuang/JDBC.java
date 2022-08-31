package LevelCache1.kuang;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class JDBC {
   private static InputStream in=null;
    private static SqlSessionFactory build =null;
    static {

        try {
               in = Resources.getResourceAsStream("SqlMapper.xml");
            build = new SqlSessionFactoryBuilder().build(in);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (in!=null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static SqlSession getConntion() {
        if (build != null){
            return build.openSession();
        }
      return null;
    }
}
