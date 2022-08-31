package com.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ajax {
   @RequestMapping("/uu")
   public  String  frontPage(){
       System.out.println("转发");
       return "tzd";
    }

    @RequestMapping("/service")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public List<Integer> list(String name, Integer age){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        return arrayList;
    }

}
