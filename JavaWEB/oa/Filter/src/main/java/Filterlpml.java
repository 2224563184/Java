import javax.servlet.*;
import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter("/*")
public class Filterlpml implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器B");

    }
}
