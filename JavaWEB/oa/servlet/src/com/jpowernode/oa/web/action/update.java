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

public class update extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        String deptno = req.getParameter("deptno");
        Integer of = Integer.valueOf(deptno);

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

//        连接数据库得到默认值
        String sql="select * from dept where deptno=?";
        Connection con = DBuitl.getConnection();
        PreparedStatement pr =null;
        ResultSet re = null;

//        打印页面
         out.println(" <!DOCTYPE html>");
         out.println(" <html lang='en'>");
         out.println(" <head>");
         out.println(" <meta charset='UTF-8'>");
         out.println(" <title>Title</title>");
         out.println(" </head>");
         out.println(" <body>");
         out.println(" <form action='/oa/updateServlet?deptno="+deptno+"' method='post'>");

//   查看数据库
        try {

            pr= con.prepareStatement(sql);
            pr.setObject(1,of);
            re=pr.executeQuery();
            re.next();
            int deptno2 =(int) re.getObject(1);
            String name = (String)re.getObject(2);
            String loc = (String)re.getObject(3);

         out.println(" <h1>部门编号:"+of+"</h1></br>");
         out.println(" 更新编号:<input type='text' name='deptno2'  value='"+deptno2+"'></br>");
         out.println(" 更新部门:<input type='text' name='dname2'    value='"+name+"'></br>");
         out.println(" 更新loc:<input type='text' name='loc2' value='"+loc+"'></br>");
         out.println(" <input type='submit'></br>");
         out.println(" </form></br>");
         out.println(" </body>");
         out.println(" </html>");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            DBuitl.close(con,pr,re);
        }
    }
}
