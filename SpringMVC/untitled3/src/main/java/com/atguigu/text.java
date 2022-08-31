package com.atguigu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class text { //中文

    @RequestMapping("/")
    public String pa() {
        int i=0;
 
        return "pa";
    }

    @RequestMapping("/user")
    public String test() {
        return "user";
    }

}
