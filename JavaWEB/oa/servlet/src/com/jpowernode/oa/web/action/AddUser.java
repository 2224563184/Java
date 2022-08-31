package com.jpowernode.oa.web.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddUser extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        /*
        *  1.发送请求,/oa/AddUser
        *  2.找到映射类AddUser
        *  3.响应重定向add.html
        * */
           response.sendRedirect("/oa/add.html");


        /*
            1.响应类型
            2.使用打印流输出
        */

      /*  response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
            writer.println("    !DOCTYPE html> ");
            writer.println("   <html lang='en' xmlns='http://www.w3.org/1999/html' xmlns:javascript='http://www.w3.org/1999/xhtml'>");
            writer.println("   <head>");
            writer.println("   <meta charset='UTF-8'>");
            writer.println("   <title>Title</title>");
            writer.println("   </head>");
            writer.println("   <body>");
            writer.println("   <form method='post' action='/oa/dept/add'>");
            writer.println("   部门编号:<input type='text' name='deptno'></br>");
            writer.println("   部门名称:<input type='text' name='dname'></br>");
            writer.println("   职务:<input type='text' name='loc'></br>");
            writer.println("   <input type='submit' javascript:void(0);>");
            writer.println("   </form>");
            writer.println("   </body>");
            writer.println("   </html>");
            writer.close();
  */
    }
}
