import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "welcome",urlPatterns = "/welcome")
public class hy extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
    try {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
    }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

//           先查看一下浏览器有没有保存过的账号密码,有的话就直接登录
//           除了账号密码的cookies还有其他的 cookie
               String  user=null;
               String  pass=null;
               if (cookies!=null){
                   for (Cookie cookie : cookies) {
                       if (cookie.getName().equals("user")){
                           user=cookie.getName();
                   }else if (cookie.getName().equals("pass")){
                           pass=cookie.getName();
                       }
           }
       }


        String sql="select * from `user` where `user`=? and pass =md5(?)";
        Connection connection=null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet =null;

        //有账号密码
        try {
            if (user != null && pass != null) {
                connection = DBuitl.getConnection();
                 preparedStatement=connection.prepareStatement(sql);
                 preparedStatement.setObject(1,Integer.parseInt(user));
                 preparedStatement.setObject(2,pass);
                resultSet= preparedStatement.executeQuery();
//                核对正确, 跳到管理系统
                if (resultSet.next()){
                    resp.sendRedirect(req.getContextPath() + "/vivc");
                }else {
//                核对错误, 跳到登录界面
                    resp.sendRedirect(req.getContextPath() + "/index.jsp");
                }
                 } else {
//       没有账号密码
                    resp.sendRedirect(req.getContextPath() + "/index.jsp");
                  }
                    }catch (Exception e){
                     e.printStackTrace();
                    }finally {
                         try {
                     if (connection!=null) {
                     connection.close();
                }
              if (preparedStatement!=null) {
                  preparedStatement.close();
              }
              if (resultSet!=null) {
                  resultSet.close();
              }
          }catch(Exception e){
              e.printStackTrace();
          }
        }
    }
}
