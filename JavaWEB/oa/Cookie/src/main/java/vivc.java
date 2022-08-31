import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

//  管理系统

@WebServlet("/vivc")
public class vivc extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session!=null&&session.getAttribute("user")!=null) {
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.printf("       <html>");
            out.printf("    <head>");
            out.printf("    <title>Title</title>");
            out.printf("    </head>");
            out.printf("    <body>");
            out.printf("    <h1> 管理系统</h1>");
            out.printf("    <a href='" + req.getContextPath() + "/user/exit'>退出系统</a>");
            out.printf("    </body>");
            out.printf("    </html>");
        }else {
            resp.sendRedirect(req.getContextPath()+"/index.jsp");
        }

    }
}
