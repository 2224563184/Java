package tetx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "user")
public class test {

    @RequestMapping(value = "/")
    public String test(){
     return "index";
    }

    @RequestMapping(value = "/app")
    public String user(){
        return "user";
    }
}
