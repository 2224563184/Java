package com.kuang.Dao;
import com.kuang.Dao.pojo.User;
import java.util.List;

public interface UserMapper {

    List<User> getUserList();

   User getUserByid(int id);

    User   addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);



}
