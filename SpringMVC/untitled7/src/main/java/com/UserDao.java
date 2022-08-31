package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.thymeleaf.spring5.view.ThymeleafView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SuppressWarnings("all")
public class UserDao {

     @RequestMapping("/user")
    public String opp(int user){
         return "user";
    }

    @RequestMapping("/file")
    public String op(){
          return  "index";

    }


    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        /*return  "redirect:/相对路径"      重定向
return  "forward: /相对路径"      转发
return  "文件名"                  转发, 自动拼接前缀路径和后缀格式
*/
        String contextPath = request.getContextPath();
        System.out.println("已响应");
        return "forward:"+contextPath+"WEB-INF/user.html";
    }
}
