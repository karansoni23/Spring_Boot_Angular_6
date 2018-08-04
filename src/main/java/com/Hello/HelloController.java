package com.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value ="/hello" , method = RequestMethod.GET)
    public String show(Model modal){

        String message = "Hello Karan !!";
        modal.addAttribute("message",message);
        return "hello";
    }

}
