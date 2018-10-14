package com.iotek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/abc")
    public String test(){
        System.out.println("sucess");

        return "b";
    }
}
