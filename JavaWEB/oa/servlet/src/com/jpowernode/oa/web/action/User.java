package com.jpowernode.oa.web.action;

import com.jpowernode.oa.web.action.DBuitl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//                           user/verify
@WebServlet(urlPatterns={"/user/verify"})
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
        int userint = Integer.parseInt(user);
        String pass = req.getParameter("pass");
        String sql="select * from `user` where `user`=?  and pass =?";
        Connection connection = null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSe=null;

        try {
             connection= DBuitl.getConnection();  //得到连接
            preparedStatement = connection.prepareStatement(sql); //得到预编译对象
            preparedStatement.setObject(1,userint);    //更新占位符
            preparedStatement.setObject(2,pass);
            resultSe= preparedStatement.executeQuery();           //表查询
            if (resultSe.next()){
                resp.sendRedirect(req.getContextPath()+"/dept/list"); //管理界面

            }else {
                resp.sendRedirect(req.getContextPath()+"/user.html");//失败页面
            }
        }catch (Exception e){
            e.printStackTrace();

        }finally {
           DBuitl.close(connection,preparedStatement,resultSe);
        }
    }
}
