package com.wxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {
    //加法器的实现，不安全的方式
    //http://localhost:8080/springmvc03/add/?r1=1&r2=2
    @RequestMapping("/add")
    public String restFul(int r1, int r2, Model model) {
        int ans = r1+r2;
        model.addAttribute("msg","结果是"+ans);
        return "test";
    }
}
