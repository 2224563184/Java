package 数据库连接池.Dao.Dao;

import jdbc.uu.Utility;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import 数据库连接池.德鲁伊.Actro;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BasicDao<T>{
    QueryRunner queryRunner=null;

//    增删改
    public int updata(String SQL, Object...paramters){
        Connection connection=null;
        int update=-1;
        try {
             connection = Utility.Druidconn();
            queryRunner=new QueryRunner();
             update = queryRunner.update(connection, SQL, paramters);
             return update;
        } catch (SQLException e) {
           throw new RuntimeException();
        }finally {
            if (connection!=null)
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


//    SQL查询语句
//    多行多列
    public List<T> getBeanlist(String SQL, Class<T>tClass, Object...par){
//        返回Druid的连接
        Connection connection  = Utility.Druidconn();

        try {
//        创建阿帕奇对象
          QueryRunner   queryRunner=new QueryRunner();
//        调用方法
            List<T> query = queryRunner.query(connection, SQL,new BeanListHandler<>(tClass), par);
         return query;
        }catch (Exception e){
              e.printStackTrace();
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

//    单行多列
    public T getBean(String SQL, Class<T>tClass, Object...objects){
        Connection connection =null;
        try {
            connection = Utility.Druidconn();
            T query = queryRunner.query(connection, SQL, new BeanHandler<T>(tClass), objects);
            return query;
        }catch (Exception e){
            throw new RuntimeException();
        }finally {
            if (connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


//      单行单列
    public Object getT(String SQL, Object objects){
        Connection connection =null;
        try {
            connection = Utility.Druidconn();
            Object query = queryRunner.query(connection, SQL, new ScalarHandler(), objects);
            return query;
        }catch (Exception e){
            throw new RuntimeException();
        }finally {
            if (connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

