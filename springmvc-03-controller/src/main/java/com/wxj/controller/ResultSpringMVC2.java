package com.wxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultSpringMVC2 {
    //需要视图解析器的转发和重定向
    //因为它的路径不完整
    @RequestMapping("/p1/t1")
    public String test1(Model model) {
        //转发
        model.addAttribute("msg", "ResultSpringMVC4");
        return "test";
    }

    @RequestMapping("/p1/t2")
    public String test2(Model model) {
        //重定向
        model.addAttribute("msg", "ResultSpringMVC5");
        return "redirect:/index.jsp";
    }
}
