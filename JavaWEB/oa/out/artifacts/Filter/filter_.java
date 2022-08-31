import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.servlet.*;
import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
@SuppressWarnings("all")

@WebFilter("*.do")
public class filter_ implements Filter {

    @Override
    public void destroy() {
        System.out.println("过滤器对象销毁前, 执行该方法");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("执行拦截");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        if (user!=null&&pass!=null) {
            Properties properties = new Properties();
            FileInputStream stream = new FileInputStream("X:\\Users\\it\\Desktop\\druid.Properties");
            properties.load(stream);
            String sql = "select * from `user` where `user`=? and pass = md5(?)";
            Connection connection = null;
            PreparedStatement pr = null;
            ResultSet resultSet = null;
            try {
                DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
                 connection = dataSource.getConnection();
                pr = connection.prepareStatement(sql);
                pr.setObject(1, Integer.parseInt(user));
                pr.setObject(2, pass);
                resultSet = pr.executeQuery();
                if (resultSet.next()) {
                    chain.doFilter(request, response);
                    System.out.println("执行下一个拦截, 如果没有则结束");
                } else {
                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                    System.out.println("过滤失败");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (connection != null) connection.close();
                    if (pr != null) pr.close();
                    if (resultSet != null) resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }else {
            System.out.println("请输入账号或者密码");
        }
    }
}
