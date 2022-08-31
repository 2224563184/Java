package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
@SuppressWarnings("all")

@Controller
public class test {
//    @RequestMapping("/testUp")
//    public  String testUUp(MultipartFile photo){
//        System.out.println("测试");
//        return "index";
//    }

////    上传文件
    @RequestMapping("/testUp")
//          photo:文件对象
    public  String  uploadFiles(MultipartFile photo,  HttpSession session){

//       文件对象.返回文件名
        String filename = photo.getOriginalFilename();

//      会话.返回应用对象
        ServletContext servletContext = session.getServletContext();

//       上下文对象.返回文件名的绝对路径
        String url = servletContext.getRealPath("photo");
        System.out.println("filename="+filename);
        System.out.println("url="+url);

        File file = new File(url);
        if (!file.exists()){
            file.mkdir();
        }

        System.out.println("file="+file);
        String finalPath = url + File.separator + filename;
        System.out.println("finalPath="+finalPath);
        try {
            for (int i = 0; i <file.list().length; i++) {

            }
            photo.transferTo(new File(finalPath));
        }catch (Exception e){
            e.printStackTrace();
        }
        return "index";

    }

    @RequestMapping("/test")
    public  String test(){
        System.out.println("1111111111111111111111111111111111111111111");
        return "index";
    }

}
