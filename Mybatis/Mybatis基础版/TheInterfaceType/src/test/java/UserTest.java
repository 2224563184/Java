import com.kuang.Dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Test;

import java.io.InputStream;

public class UserTest {

    @Test
    public   void  test(){
        /*
         * 方式一:
         * */

//        Logger logger = Logger.getLogger(UserMapper.class);
        try {

            InputStream inputStream = Resources.getResourceAsStream("MappUsers.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = build.openSession();
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
              userDao.getUserList();
        }catch (Exception e){
            e.printStackTrace();
//            logger.error("Exception: ", e);
        }
//        int i = userDao.deleteUser(1);
//        System.out.println(i);

//        User user = new User(1,null,null,null,null); // 传递引用类型
//        User addUser = userDao.addUser(user);
//        System.out.println(addUser);

//        User userByid = userDao.getUserByid(1);       传递基本类型
//        System.out.println(userByid);

//        List<User> userList = userDao.getUserList();   返回结果集
//        for (int i = 0; i < userList.size(); i++) {
//            System.out.println(userList.get(i));
//        }


    }
}
