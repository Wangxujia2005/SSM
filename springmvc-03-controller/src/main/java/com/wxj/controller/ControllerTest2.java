package com.wxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller 注解的类会自动添加道Spring上下文中
@Controller

public class ControllerTest2 {
    @RequestMapping("/t2")
    //映射访问路径 ;
    public String index(Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg","人生的容错率很高，请一定不要放弃");
        return "test";
    }
}
