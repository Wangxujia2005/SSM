package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@Controller 用于标记普通的 Spring MVC 控制器，返回值通常是视图名（比如 JSP），用于页面跳转。
@RestController 是 @Controller 和 @ResponseBody 的组合，返回值直接作为 HTTP 响应体（如 JSON、字符串），常用于前后端分离或 AJAX 接口。
 */
@RestController
public class AjaxController {
    @RequestMapping("/hello")
    public String test01(){
        return "hello";
    }
}
