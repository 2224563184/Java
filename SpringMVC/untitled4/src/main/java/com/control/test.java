package com.control;

import com.Dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@SuppressWarnings("all")
//@Controller
public class test {
//    同类型自动装配
//   @Autowired
   private EmployeeDao employeeDao;

//    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public  String select(ModelAndView modelAndView){
          modelAndView.addObject("",employeeDao);
        return "select";
    }

}
