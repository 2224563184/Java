package 数据库连接池.德鲁伊;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mysql.jdbc.Driver;
import jdbc.uu.JDBCUtility;
import jdbc.uu.Utility;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import javax.sql.DataSource;
import java.beans.Transient;
import java.io.FileInputStream;
import java.sql.*;
import java.util.List;
import java.util.Properties;

public class Druid {
    //          连接方式1

    public void a() throws Exception {
//        定义Mysql驱动对象
        Class<?> mysqlclass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) mysqlclass.newInstance();

//        定义德鲁伊连接池对象
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriver(driver); // 注册驱动
//        设置配置
        druidDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/hsp_005?characterEncoding=utf-8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("000000");

//        得到连接对象
        DruidPooledConnection connection = druidDataSource.getConnection();
//        得到预处理对象
        PreparedStatement pr = connection.prepareStatement("insert into adc (name,age) values(?,?);");
//        执行
        pr.setString(1, "爱爱");
        pr.setObject(2, 465);
//        执行SQL语句
        pr.execute();
    }

    //    连接方式2

    public Connection b() throws Exception {
//        定义pro集合
        Properties properties = new Properties();
//        读取配置文件,填充 键 值
        properties.load(new FileInputStream("X:\\Users\\it\\Desktop\\druid.Properties"));
//        实现数据源接口
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        返回连接对象吗
       return dataSource.getConnection();
    }
    @Test
    public  void ss()throws Exception{
        String sql = "select * from `user` where `user`=? and md5(?)";
        Connection b = b();
        PreparedStatement pr = b.prepareStatement(sql);
        pr.setObject(1, Integer.parseInt("000"));
        pr.setObject(2, "000");
        ResultSet resultSet = pr.executeQuery();

    }
}