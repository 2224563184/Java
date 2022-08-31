import LevelCache1.kuang.JDBC;
import LevelCache1.kuang.MapperUser;
import LevelCache1.kuang.Users;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest {
    @Test
   public void psvm()throws Exception{
        SqlSession sqlSession = JDBC.getConntion();
//        InputStream inputStream = Resources.getResourceAsStream("SqlMapper.xml");
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sessionFactory.openSession();
        MapperUser mapperUser = sqlSession.getMapper(MapperUser.class);
//        List<Users> list = mapperUser.getList();
//        System.out.println(list);
        Users users = mapperUser.getUsers(1);
        System.out.println(users);
    }
}
