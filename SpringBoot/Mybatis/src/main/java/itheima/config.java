package itheima;


import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config   {

//    创建拦截器
    @Bean
    public MybatisPlusInterceptor add(){
        MybatisPlusInterceptor tor = new MybatisPlusInterceptor();

//      添加拦截对象
        tor.addInnerInterceptor(new PaginationInnerInterceptor()); //分页插件
        tor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());//乐观锁插件
        return tor;
    }
}
