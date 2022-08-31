package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController/**/;

@RestController
public class contor {
   @RequestMapping("/book")
    public String test() {
        return "ppppppppppppp";
    }

    @RequestMapping("/b")
    public String test2() {
        return "cccccccccccccccc";
    }
}
