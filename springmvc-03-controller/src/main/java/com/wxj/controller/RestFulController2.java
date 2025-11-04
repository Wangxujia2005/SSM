package com.wxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;

@Controller
public class RestFulController2 {
    @RequestMapping("/add/{r1}/{r2}")
    public String restful2(@PathVariable int r1,@PathVariable String r2, Model model){
        String ans = r1+r2;
        model.addAttribute("msg","加法的结果是"+ans);
        return "test";
    }

    @RequestMapping(value = "/home",method = {RequestMethod.GET})
    public String get(Model model) {
        model.addAttribute("msg", "这是get请求");
        return "test";
    }
}
