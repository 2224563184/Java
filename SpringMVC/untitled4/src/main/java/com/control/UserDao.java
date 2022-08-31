package com.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.MultipartFilter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
@SuppressWarnings("all")
@Controller
public class UserDao {

    @RequestMapping("/down")
    @ResponseBody
    public ArrayList<Integer> test(){
        ArrayList<Integer> objects = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            objects.add(i);
        }
        return  objects;
    }

//    上传文件
/*  1.添加上传解析器
    2.设置映射请求路径的函数
    3.
* */
    @RequestMapping("/file")
    public  String file(MultipartFile multipartFilter, HttpSession session) throws IOException {
        String filename = multipartFilter.getOriginalFilename();
        ServletContext servletContext = session.getServletContext();
        String url = servletContext.getRealPath("multipartFilter");
        File file = new File(url);
        if (!file.exists()){
            file.mkdir();
        }

        String finalPath = url + File.separator + filename;
        multipartFilter.transferTo(new File(finalPath));

         return "index";

    }


}
