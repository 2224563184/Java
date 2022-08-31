package itheima.controller;

import itheima.Dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
public class controller {
//
//    @Value("${chineuu.userid}")
//    private  String name;
//    @Value("${chineuu.age}")
//   private Integer age;
//    @Autowired
//    private Environment env;
//
//    @Autowired
//    StudentDao studentDao;
    @RequestMapping("/user")
    @ResponseBody
    public String user() {
//        System.out.println("name="+",age="+age);
//        System.out.println(studentDao.selectById());
        return "66666";
    }
}
