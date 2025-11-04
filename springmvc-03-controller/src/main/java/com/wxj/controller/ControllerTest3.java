package com.wxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller 注解的类会自动添加道Spring上下文中
@Controller
@RequestMapping("/h")
public class ControllerTest3 {
    @RequestMapping("/t3")
    public String test(Model model){
        model.addAttribute("msg","失败乃成功之母");
        return "test";
    }
}
