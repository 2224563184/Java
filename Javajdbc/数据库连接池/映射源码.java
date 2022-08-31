package 数据库连接池;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mysql.jdbc.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class 映射源码 {
private String name;
private int    age;
private static ArrayList<映射源码>list=new ArrayList<>();

    public 映射源码(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  ArrayList<映射源码> getArraylist(Connection connection, String SQL){
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
         preparedStatement = connection.prepareStatement(SQL);
         resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            int age = resultSet.getInt("int");
            list.add(new 映射源码(name,age));
        }
        resultSet.close();
        preparedStatement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }finally {
         if (resultSet!=null)
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
         if (preparedStatement!=null)
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    return list;
}
}
