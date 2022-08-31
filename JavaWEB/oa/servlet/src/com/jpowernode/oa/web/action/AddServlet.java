package com.jpowernode.oa.web.action;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
         try {
             Class.forName("com.mysql.jdbc.Driver");
         }catch (ClassNotFoundException e){
          throw new RuntimeException(e.getMessage());
         }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response ) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.sendRedirect("/oa/dept/list");
        String sql="INSERT INTO dept (deptno , dname  , loc ) values(?,?,?)";
        Connection con = null;
        PreparedStatement pr = null;
        try {
            con=DBuitl.getConnection();
            pr=con.prepareStatement(sql);
            String deptno = req.getParameter("deptno");
            pr.setObject(1,Integer.parseInt(deptno));
            pr.setObject(2,req.getParameter("dname"));
            pr.setObject(3,req.getParameter("loc"));
            pr.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBuitl.close(con,pr,null);
        }

    }
}
