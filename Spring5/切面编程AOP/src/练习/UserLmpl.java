package 练习;

import com.alibaba.druid.pool.DruidDataSource;
import 练习.User;

import java.awt.dnd.DragSource;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class UserLmpl implements User {

    public  void register(){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {

            Class<?> aClass = Class.forName("com.alibaba.druid.pool.DruidDataSource");
            DruidDataSource druidDataSource = (DruidDataSource) aClass.newInstance();

            druidDataSource.setUrl("jdbc:mysql://127.0.0.1:3306");
            druidDataSource.setUsername("root");
            druidDataSource.setPassword("000000");
            druidDataSource.setDriver(new com.mysql.jdbc.Driver());

            connection = druidDataSource.getConnection();

            String sql = "SELECT * FROM hsp_005.USER WHERE USER=";
            Scanner scanner = new Scanner(System.in);
            System.out.print("输入账号:");
            String user = scanner.next();
            System.out.print("输入密码:");
            String pass = scanner.next();

            String sql2 = sql + user;
            String sql3 = sql2 + "and PASS=" + pass;
            preparedStatement   = connection.prepareStatement(sql2);
            resultSet  = preparedStatement.executeQuery();
            String user2 = null;
            String pass2 = null;
            while (resultSet.next()) {
                user2 = (String) resultSet.getObject(1);
                pass2 = (String) resultSet.getObject(2);
            }
            if (user2.equals(user) && pass2.equals(pass)) {
                System.out.println("登录成功");
                return;
            }
        }catch (Exception e){
            e.fillInStackTrace();
        }finally {
            if (connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (resultSet!=null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
