package com.jpowernode.oa.web.action;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class DeptListServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        try{
            Class.forName("com.mysql.jdbc.Driver");

        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Connection con=null;
        PreparedStatement pr=null;
        ResultSet re=null;
         String sql="SELECT * FROM dept";
         String sql2=sql;
        PrintWriter out=null;
         int index=0;

        try {
            String contextPath = request.getContextPath();
            out = response.getWriter();
            out.println(" <!DOCTYPE html> ");
            out.println("  <html lang='en'>");
            out.println("  <head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>Title</title>");
            out.println("  </head>");
            out.println("  <body>");

            out.println(" <script> ");
            out.println("  function myFunction(queu){ ");
            out.println("  if (window.confirm('确定删除?')){");
            out.println("  document.location.href='/oa/dept/detect?Numbering='+queu");
            out.println(" alert('正在删除')");
            out.println("  }");
            out.println("}");

            out.println("</script>");
            out.println("<h1>欢迎使用</h1>");
            out.println(" <table border='1xp' cellspacing='0' align='center'frame='box'>");
            out.println("  <tr>");
            out.println("<th>列号</th>");
            out.println("<th>部门编号</th>");
            out.println("<th>部门名称</th>");
            out.println("<th>操作</th>");
            out.println("  </tr>");
         con=DBuitl.getConnection();
          pr = con.prepareStatement(sql);
          re = pr.executeQuery(sql2);
//          动态网页
          while (re.next()){
              int Numbering = (int)re.getObject("deptno");
              String name = (String)re.getObject("dname");
              String operate = (String)re.getObject("loc");
              out.println("<tr>");
              out.println(" <th>"+(++index)+" </th>");
              out.println(" <th>"+Numbering+" </th>");
              out.println(" <th>"+name+"</th>");
              out.println(" <td>");
              out.println("<a href='#'onclick='myFunction("+Numbering+")'>删除</a>");
              out.println("  <a href='/oa/update?deptno="+Numbering+"'>更新</a>");
              out.println("  <a href='"+contextPath+"/dept/detail?Numbering="+Numbering+"'>详情</a>");
              out.println("</td>");
              out.println("</tr>");
/*
*     删除思路:
*            1.鼠标事件
*            2.弹窗警告
*            3.不更新页面
*            4.发送删除请求路径
*            5.传递要删除的参数
*            6.映射类接收参数
*            8,连接数据库
*            9.根据参数删除一行记录
*
* */

          }
      }catch (Exception th){
            System.out.print(th.getMessage());
      }finally {
            if (out!=null) {
                out.println(" </table>");
                out.println("  <hr>");
                out.println(" <a href='/oa/add/user' >新增部门</a>");
                out.println("  </body>");
                out.println("  </html>");
            }
            try {
                if (out != null) {
                    out.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
              try {
                  if (con!=null) {
                      con.close();
                  }
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
          try {
              if (re!=null) {
                  re.close();
              }
          } catch (SQLException e) {
              e.printStackTrace();
          }

      }

    }

}
