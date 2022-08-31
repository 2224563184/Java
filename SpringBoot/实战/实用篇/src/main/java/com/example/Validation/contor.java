package com.example.Validation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/books")

public class contor {
    @GetMapping
    @ResponseBody
    public String add(){
        return "55555555555";
    }
}
