package com.wxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InterceptorController {
    @RequestMapping("/k1")
    @ResponseBody
    public String testFunction(){
        System.out.println("控制器里的方法执行了");
        return "hello";
    }
}
