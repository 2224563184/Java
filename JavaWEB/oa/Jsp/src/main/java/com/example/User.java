package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User extends HttpServlet {
    @Override
    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        String sql="select * from user where user=?and pass =?";
        Connection connection = null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSe=null;
        try {
             connection=DBuitl.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1,user);
            preparedStatement.setObject(2,pass);
            resultSe= preparedStatement.executeQuery();
            if (resultSe.next()){
                resp.sendRedirect(""); //管理界面
            }else {
                resp.sendRedirect("");//失败页面
            }
        }catch (Exception e){

        }finally {

        }
    }
}
