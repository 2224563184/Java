package 数据库连接池.查询优化;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mysql.jdbc.Driver;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;
import 数据库连接池.德鲁伊.Actro;


import java.util.List;


public class 优化查询 {

    @Test
    // 多行多列
   public void a()throws Exception{
       //        创建驱动对象
       Driver driver = new Driver();
//        创建连接池对象
       DruidDataSource druidDataSource = new DruidDataSource();
       druidDataSource.setDriver(driver);
       druidDataSource.setUsername("root");
       druidDataSource.setPassword("000000");
       druidDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/hsp_005?characterEncoding=utf-8");
//        返回连接对象
       DruidPooledConnection connection = druidDataSource.getConnection();

       String sql="select * from adc where age>?";
       QueryRunner queryRunner = new QueryRunner();
       List<Actro> query = queryRunner.query(connection,sql, new BeanListHandler<>(Actro.class), 1);
        for (int i = 0; i < query.size(); i++) {
            System.out.println(query.get(i));
        }
   }

//    单行多列
   @Test
   public void b()throws Exception{
       //        创建驱动对象
       Driver driver = new Driver();
//        创建连接池对象
       DruidDataSource druidDataSource = new DruidDataSource();
       druidDataSource.setDriver(driver);
       druidDataSource.setUsername("root");
       druidDataSource.setPassword("000000");
       druidDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/hsp_005?characterEncoding=utf-8");
//        返回连接对象
       DruidPooledConnection connection = druidDataSource.getConnection();

       String sql="select * from adc where age>?";
       QueryRunner queryRunner = new QueryRunner();
       Actro query = queryRunner.query(connection, sql, new BeanHandler<>(Actro.class), 1);
       System.out.println(query);
   }

//   单行单列
    @Test
   public void c()throws Exception{
        //        创建驱动对象
        Driver driver = new Driver();
//        创建连接池对象
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriver(driver);
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("000000");
        druidDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/hsp_005?characterEncoding=utf-8");
//        返回连接对象
        DruidPooledConnection connection = druidDataSource.getConnection();

        String sql="select age from adc where age>?";
        QueryRunner queryRunner = new QueryRunner();
        Object obj = queryRunner.query(connection, sql, new ScalarHandler<>(), 25);
        System.out.println(obj);
   }
}




