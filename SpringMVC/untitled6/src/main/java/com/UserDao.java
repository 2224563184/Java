package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SuppressWarnings("all")
@Controller
public class UserDao {
    @RequestMapping("/p")

    public String  test(){
          return "lan";
    }

}
