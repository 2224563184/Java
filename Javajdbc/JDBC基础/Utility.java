package jdbc.uu;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.alibaba.druid.stat.JdbcDataSourceStat;

import javax.sql.DataSource;
import java.io.*;
import java.sql.*;
import java.util.Properties;

public class Utility {
   /* public static void main(String[] args)throws Exception {
         String url="jdbc:mysql://127.0.0.1:3306";
            Class<?> aClass = Class.forName("com.mysql.jdbc.Driver"); //jdbc驱动对象
            Driver driver = (Driver) aClass.newInstance();               //创建驱动对象
            DriverManager.registerDriver(driver);                        //注册驱动
//            Connection connection = DriverManager.getConnection(url, user, password); //返回连接对象
            Connection connection = DriverManager.getConnection(url, "root", "000000");
        System.out.println(connection);
    }

//    jdbc执行查询的SQL语句并且返回结果集对象
    public static ResultSet select(Connection connection, String SQL, Object... args){
         try {
             PreparedStatement pr = connection.prepareStatement(SQL);
             for (int i = 0; i < args.length; i++) {
                 pr.setObject(i+1,args[i]);
             }
             ResultSet resultSet = pr.executeQuery();
             return resultSet;
         }catch (Exception e){
         }
        return null;
    }
*/

    public static Connection  Jdbc(String url,String user,String password){
        try {
            Class<?> aClass = Class.forName("com.mysql.jdbc.Driver"); //jdbc驱动对象
            Driver driver = (Driver) aClass.newInstance();               //创建驱动对象
            DriverManager.registerDriver(driver);                        //注册驱动
//            Connection connection = DriverManager.getConnection(url, user, password); //返回连接对象
            Connection connection = DriverManager.getConnection(url, "root", "000000");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


//    jdbc执行增删改的SQL语句并且返回boolean结果
  public static boolean update(Connection connection, String SQL, Object...args) {
      PreparedStatement pre=null;
      try {
           pre = connection.prepareStatement(SQL);
          for (int i = 0; i < args.length; i++) {
              pre.setString(i+1,(String)args[i]);
          }
          boolean execute = pre.execute();
          return  execute;
      }catch (Exception e){

      }finally {
          if (pre!=null){
              try {
                  pre.close();
              } catch (SQLException e) {
                  e.printStackTrace();
              }
          }
          if (connection!=null) {
              try {
                  connection.close();
              } catch (SQLException e) {
                  e.printStackTrace();
              }
          }
      }
      return false;
  }



//          输入流

  public byte[] ByteInptStram(String url){
      BufferedInputStream bufferedInputStream=null;
      ByteArrayOutputStream byt=null;
        try {
//            定义对象并且设置路径
             bufferedInputStream = new BufferedInputStream(new FileInputStream(url));
//            读取数据
            byte [] arr=new byte[1024];
            int len=-1;
             byt = new ByteArrayOutputStream();
            while ((len=bufferedInputStream.read(arr))!=-1){
                byt.write(arr,0,arr.length);
            }
            return  byt.toByteArray();
        }catch (IOException e){
        }finally {
            if (bufferedInputStream!=null)
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (byt!=null) {
                try {
                    byt.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return  null;

  }
//  输入流重载
    public byte[] ByteInptStram(File url){
        BufferedInputStream bufferedInputStream=null;
        ByteArrayOutputStream byt=null;
        try {
//            定义对象并且设置路径
            bufferedInputStream = new BufferedInputStream(new FileInputStream(url));
//            读取数据
            byte [] arr=new byte[1024];
            int len=-1;
            byt = new ByteArrayOutputStream();
            while ((len=bufferedInputStream.read(arr))!=-1){
                byt.write(arr,0,arr.length);
            }
            return  byt.toByteArray();
        }catch (IOException e){

        }finally {
            if (bufferedInputStream!=null)
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (byt!=null) {
                try {
                    byt.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return  null;
    }



//        字节输出流
    public boolean outputStram(String url,byte [] arr){
//        定义输出流对象
        BufferedOutputStream bufferedOutputStream=null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(url));
            bufferedOutputStream.write(arr,0,arr.length);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedOutputStream!=null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public static Connection Druidconn(){
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("X:\\Users\\it\\Desktop\\配置.Properties"));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            Connection connection = dataSource.getConnection();
return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
          return null;
    }
}
