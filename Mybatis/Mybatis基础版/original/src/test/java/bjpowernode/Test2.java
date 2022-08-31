package bjpowernode;

import com.bjpowe.Test.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test2 {
    SqlSession sqlSession;
    @Before
    public  void beFore(){
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }
    @Test
    public  void getTest(){
        List<User> list = sqlSession.selectList("name");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    @After
    public  void  getEng(){
            sqlSession.close();
    }
}
