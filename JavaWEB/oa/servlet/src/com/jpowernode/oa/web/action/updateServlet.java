package com.jpowernode.oa.web.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class updateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.sendRedirect("/oa/dept/list");

        int deptno = Integer.parseInt(req.getParameter("deptno"));

        int deptno2 = Integer.parseInt(req.getParameter("deptno2"));
        String dname2 = req.getParameter("dname2");
        String loc2 = req.getParameter("loc2");

        String sql="UPDATE dept  SET deptno=?,dname=?,loc=? where deptno=?";
        Connection con = null;
        PreparedStatement pr = null;

        try {
            con=DBuitl.getConnection();
            pr=con.prepareStatement(sql);
            pr.setObject(1, deptno2);
            pr.setObject(2, dname2);
            pr.setObject(3, loc2);
            pr.setObject(4,deptno);
            pr.executeUpdate();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            DBuitl.close(con,pr,null);
        }

    }
}
