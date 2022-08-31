package com.jpowernode.oa.web.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Delete extends HttpServlet {
    @Override
    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/oa/dept/list");
        String numbering = req.getParameter("Numbering");
        String sql="DELETE FROM dept WHERE deptno=? ";
        Connection connection = DBuitl.getConnection();
        PreparedStatement pr = null;
        ResultSet re = null;


        try {
            //预编译对象
             pr=connection.prepareStatement(sql);
            //填充占位符
            pr.setObject(1,numbering);
            //执行sql语句
            pr.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            if (connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                    try {
                        if (pr!=null) {
                        pr.close();
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                if (re!=null) {
                    try {
                        re.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
}
}
