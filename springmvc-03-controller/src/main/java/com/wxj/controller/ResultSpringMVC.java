package com.wxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultSpringMVC {
    //不需要视图解析器的转发和重定向
    //因为它写了完整的路径
    @RequestMapping("/k1/t1")
    public String test1(Model model) {
        model.addAttribute("msg", "ResultSpringMVC1");
        //转发
        return "/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("/k1/t2")
    public String test2(Model model) {
        //转发2
        model.addAttribute("msg", "呵呵呵呵呵呵");
        return "forward:/WEB-INF/jsp/forward.jsp";
    }

    @RequestMapping("/k1/t3")
    public String test3(Model model){
        //重定向
        model.addAttribute("msg","ResultSpringMVC3");
        return "redirect:/index.jsp";
    }
}
