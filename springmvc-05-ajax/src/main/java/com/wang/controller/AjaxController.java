package com.wang.controller;

import com.wang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
@Controller 用于标记普通的 Spring MVC 控制器，返回值通常是视图名（比如 JSP），用于页面跳转。
@RestController 是 @Controller 和 @ResponseBody 的组合，返回值直接作为 HTTP 响应体（如 JSON、字符串），常用于前后端分离或 AJAX 接口。
 */

/*
如何理解异步？
前提：在同一个网页中。
比如我在微博里发一条微博，我在等待它发送的过程中可以去浏览其他的内容，这个过程就是异步。
同步：必须等我发完微博，才能干别的事。
异步：我发微博的过程中，我可以干别的事。
 */

@RestController
public class AjaxController {
    @RequestMapping("/hello")
    public String test01(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>"+name);
        if ("admin".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> userList = new ArrayList<User>();
        userList.add(new User("张三",23,"男"));
        userList.add(new User("李四",24,"女"));
        userList.add(new User("王五",25,"男"));
        return userList;
    }

    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg = "";
        //模拟数据库中存在数据
        if (name != null) {
            if("admin".equals(name)){
                msg = "OK";
            }else{
                msg = "用户名有误";
            }
        }
        if(pwd!=null){
            if("123456".equals(pwd)){
                msg = "OK";
            }else{
                msg = "密码有误";
            }
        }
        return msg;//由于使用了 @RestController 注解，将msg转成json格式返回
    }
}
