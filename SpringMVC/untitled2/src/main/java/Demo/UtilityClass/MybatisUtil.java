package Demo.UtilityClass;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
   private static SqlSessionFactory factory=null;
    static {
        try {
            /*
            * 读取配置
            * 使用建造者解析配置
            * 得到工厂对象
            * 工厂对象变成静态
            * 返回会话对象(连接)*/
            InputStream in = Resources.getResourceAsStream("Mybatis/Mapper.xml");
            factory = new SqlSessionFactoryBuilder().build(in);
        }catch (IOException e){
            throw new RuntimeException("配置错误");
        }
    }
    public  static SqlSession getSqlSession(){
        return  factory.openSession();
    }
    public static  SqlSessionFactory getFactory(){
        if (factory!=null)
        return factory;
        return null;
    }

}
