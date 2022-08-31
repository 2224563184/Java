package com.jpowernode.oa.web.action;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Student extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
           try {
               Class.forName("com.mysql.jdbc.Driver");
           }catch (ClassNotFoundException e){
               e.printStackTrace();
           }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("睡觉");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)  {

        System.out.println("妙啊");
//          设置响应内容的类型
          resp.setContentType("text/html");
//          获取打印流
          PrintWriter out = null;


//          连接数据库
        String url="jdbc:mysql://127.0.0.1:3306/bjpowernode?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String user="root";
        String passw="000000";
        String sql="select * from t_student";
        Connection connection =null;
        ResultSet re=null;
        PreparedStatement pa=null;
        try {
            out = resp.getWriter();
            out.println("李佩金");


            connection= DriverManager.getConnection(url, user, passw);
            pa  = connection.prepareStatement(sql);
           re = pa.executeQuery();

             while (re.next()){
            out.println( re.getObject("no,"+"name")+"<br/>");
             }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if (connection!=null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (pa!=null) {
                try {
                    pa.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            try
            {
             if (re!=null) {
                 re.close();
             }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
