import java.io.*;
import java.sql.*;

public class DBuitl {

    public static Connection getConnection() {
        String user = "root";
        String passw = "000000";
        String url = "jdbc:mysql://127.0.0.1:3306/bjpowernode?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        try {
        return DriverManager.getConnection(url, user, passw);
        } catch (Exception th) {
            throw new RuntimeException(th.getMessage());
        }
    }




    public     void  getIO(){

        BufferedReader buff=null;  //字符流
        BufferedWriter write=null;
        String user="X:\\Users\\it\\Desktop\\02代码.html";
         String sd="System.out.println('";
        char[] chars = sd.toCharArray();
        chars[chars.length-1]='"';
        char[] chs={'"',')',';'};
        String str=null;
        try {
           buff= new BufferedReader(new FileReader(user));
           write=new BufferedWriter(new FileWriter("X:\\Users\\it\\Desktop\\xxx.txt"));
            while ((str=buff.readLine())!=null){
                
                write.write(chars,0,chars.length);
                write.flush();
                write.write(str,0,str.length());
                write.flush();
                write.write(chs,0,chs.length);
                write.flush();
                write.write(chars);
                write.flush();

            }

        }catch (IOException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }finally {
            if (buff!=null) {
                try {
                    buff.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (write!=null) {
                try {
                    write.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
public  static void close(Connection con, PreparedStatement pr, ResultSet rs){
       if (con!=null) {
           try {
               con.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }

       if (pr!=null) {
           try {
               pr.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }

       if (rs!=null) {
           try {
               rs.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }

}

}
