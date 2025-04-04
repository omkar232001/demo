package com.example.Practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Control {
    @RequestMapping("/")
    public String s(){
        return "Hello properties";
    }
}
