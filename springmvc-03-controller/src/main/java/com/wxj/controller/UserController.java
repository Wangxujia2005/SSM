package com.wxj.controller;

import com.wxj.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
Model 只有寥寥几个方法只适合用于储存数据，简化了新手对于Model对象的操作和理解；
ModelMap 继承了 LinkedMap，除了实现了自身的一些方法，同样的继承 LinkedMap 的方法和特性；
ModelAndView 可以在储存数据的同时，可以进行设置返回的逻辑视图，进行控制展示层的跳转。
 */
@Controller
@RequestMapping("user")
public class UserController {

    //http://localhost:8080/springmvc03/user/t1?name=wxj
    @GetMapping("/t1")
    public String test(String name, Model model){
        //1.接收前端参数
        System.out.println("接收到前端的参数为："+name);
        //2.将返回的值传递给前端
        model.addAttribute("msg","name");
        //3.跳转视图
        return "test";
    }

    //http://localhost:8080/springmvc03/user/t2?username=wxj
    @GetMapping("/t2")
    public String test2(@RequestParam("username") String name, Model model){
        //接收前端数据
        System.out.println("接收到前端的参数为："+name);
        //将返回的值传递给前端
        model.addAttribute("msg","username");
        //跳转视图
        return "test";
    }

    //http://localhost:8080/springmvc03/user/t3?id=1&name=wxj&age=20
    //这里id，name，age顺序不影响
    @GetMapping("/t3")
    public String test3(User user,Model model){
        //接收前端的数据
        System.out.println("接收到前端的数据为："+user);
        //将返回的值传递给前端
        model.addAttribute("msg","user");
        //跳转视图
        return "test";
    }

    //http://localhost:8080/springmvc03/user/t4?username=wxj
    @GetMapping("/t4")
    public String test2(@RequestParam("username") String name, ModelMap model){
        // 封装要显示到视图中的数据
        // 相当于req.setAttribute("name",name);
        // 1.接收前端参数
        System.out.println("接收到前端的参数为:" + name);
        // 2.将返回的值传递给前端
        model.addAttribute("msg","username2");
        // 3.跳转视图
        return "test";
    }

}
