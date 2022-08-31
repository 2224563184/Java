package 数据库连接池.查询优化;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import jdbc.uu.Utility;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

public class 练习 {
//    需求:  使用德鲁伊+阿帕奇,完成增删改查
//@Test
//            添加
    public void add()throws  Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream("X:\\Users\\it\\Desktop\\配置.Properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        返回连接对象
        Connection connection = dataSource.getConnection();
        PreparedStatement pr = connection.prepareStatement("insert into adc(name,age) values(?,?)");
        pr.setObject(1,"小红");
        pr.setObject(2,-10);
        System.out.println(pr.execute());
    }
//     删除
//    @Test
    public void delest()throws  Exception{
        Connection connection = Utility.Druidconn();
        QueryRunner queryRunner = new QueryRunner();
        int update = queryRunner.update(connection, "delete  from adc where name=?","???");
        connection.close();
        System.out.println(update);
    }
//    更新
    @Test
    public void updd()throws Exception{
        Connection connection = Utility.Druidconn();
        QueryRunner queryRunner=new QueryRunner();
        String sql="UPDATE  hsp_005.adc SET NAME=? WHERE age =?";
        int as = queryRunner.update(connection, sql, "小明", 465);
        System.out.println(as);
    }


}
