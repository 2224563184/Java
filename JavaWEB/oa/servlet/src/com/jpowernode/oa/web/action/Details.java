package com.jpowernode.oa.web.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Details extends HttpServlet {
    @Override
    public void init() throws ServletException {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
               resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        String numbering = req.getParameter("Numbering"); //部门编号
        Connection connection = null;                        //连接数据库
        String sql="select * from dept where deptno= ?";
        PreparedStatement pr =null;
        ResultSet query =null;
        try {

                connection=DBuitl.getConnection();
                pr=  connection.prepareStatement(sql);
                pr.setObject(1,numbering);
                query= pr.executeQuery();
                out=resp.getWriter();

         if (out!=null) {
             out = resp.getWriter();
             out.print("<!DOCTYPE html>");
             out.print("<html lang='en'>");
             out.print("<head>");
             out.print("<meta charset='UTF-8'>");
             out.print("<title>详情</title>");
             out.print("</head>");
             out.print("<body>");

             while (query.next()) {
                 int object = (int) query.getObject(1);
                 String object1 = (String) query.getObject(2);
                 String object2 = (String) query.getObject(3);
                 out.print("    <div>" + object + "</div> ");
                 out.print("    <div>" + object1 + "</div> ");
                 out.print("    <div>" + object2 + "</div> ");
             }
         }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {

            if (out!=null) {
                out.print("</body>");
                out.print("</html>");
            }
            try {
                if (out != null)
                    out.close();
            } catch (NullPointerException e) {
                 e.printStackTrace();
            }
        }
    }
}
        
        


