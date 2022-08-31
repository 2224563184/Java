package 事务.声明式.注解式.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import 事务.声明式.注解式.Dao.UserDao;

@Service(value = "userService")
public class UserService {
//    private UserDao userDao=new UserDaolmpl();
    @Autowired
private UserDao userDao;
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.SERIALIZABLE)
    public void and(){

      userDao.add();
      userDao.redu();
    }
}
