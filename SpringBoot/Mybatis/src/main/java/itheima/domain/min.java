package itheima.domain;


import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class min {
    public static void main(String[] args)throws Exception {

        Driver driver = new Driver();
        String url = "jdbc:mysql://127.0.0.1:3306/mp?characterEncoding=utf-8";
        String user="root";
        String pass="000000";
        Connection connection = DriverManager.getConnection(url, user, pass);
        String sql="insert into tb_user values(?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, "xxx");
        statement.setObject(2,"xxx" );
        statement.setObject(3,"xxx" );
        statement.setObject(4,0);
        statement.setObject(5,"xxx" );
        for (int i = 0; i < 10000; i++) {
            statement.setObject(6,i );
            statement.executeUpdate();
        }


    }
}
