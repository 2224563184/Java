package resultMap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class JDBC {
    private static SqlSessionFactory build = null;

//    static {
//        InputStream in = null;
//        try {
//            in = Resources.getResourceAsStream("SqlMapper.xml");
//            build = new SqlSessionFactoryBuilder().build(in);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (in != null) {
//                    in.close();
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }

    public static SqlSession getConntion() {
        if (build != null) {
            return build.openSession();
        }
        return null;
    }

    public static SqlSession getConntion(String url) {
        build = null;
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(url);
            build = new SqlSessionFactoryBuilder().build(in);
            return build.openSession();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

