package Demo;

import Demo.UtilityClass.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hellController {


//    首页
    @RequestMapping(value = "/")
    public  String hello(){
        return "HomePage";
    }

//    登录验证
    @RequestMapping(value = "/username/register")
    public void register(){
//            创建模型层登录对象
//            调用验证函数
        

    }
}
