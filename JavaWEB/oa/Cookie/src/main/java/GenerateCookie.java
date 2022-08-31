import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet({"/user/login","/user/exit"})
public class GenerateCookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String servletPath = request.getServletPath();      //获取请求路径
        String verify = request.getParameter("verify");  //复选框

//        根据请求路径区分情况
            if ("/user/login".equals(servletPath)){          //登录请求
            if (verify!=null){
//                7天免登录
                dologin(request, response, true);
            }else {
//                每次登录
                dologin(request, response, false);
            }
        }else if ("/user/exit".equals(servletPath)){        //退出请求
            doexit(request,response );
        }

    }

    private void doexit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession session = request.getSession(false);
         if (session!=null){
             session.removeAttribute("user");
             session.removeAttribute("pass");
             session.invalidate();   //销毁
         }
        response.sendRedirect(request.getContextPath()+"/index.jsp");
    }

    private void dologin(HttpServletRequest request, HttpServletResponse response,  boolean verify) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        HttpSession sess = request.getSession(false);
        if (sess!=null){

        }
//        登录成功
        if ("000".equals(user)&&"000".equals(pass)){
            HttpSession session = request.getSession();
            long creationTime = session.getCreationTime();
            session.setAttribute("user",user);
            if (verify){
                Cookie UserCookie = new Cookie("user", user);
                Cookie PassCookie = new Cookie("pass", pass);
                UserCookie.setMaxAge(60*60*24*7);
                PassCookie.setMaxAge(60*60*24*7);
                response.addCookie(UserCookie);
                response.addCookie(PassCookie);
            }
            response.sendRedirect(request.getContextPath()+"/vivc");
        }else {
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
    }
}
