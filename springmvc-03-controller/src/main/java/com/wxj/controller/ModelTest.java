package com.wxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class ModelTest {

    //D10AABE63843C3FB1C91D4FF914DD177这是运行后的session的id
    //说明不用走视图解析器这一层也可以得到session
    @RequestMapping("/m1/t1")
    public String test1(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        return "test";
    }

    @RequestMapping("/m2/t1")
    public void test2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("Hello,Sring By servlet API");
    }

//     这个不知道为什么运行不了
//    @RequestMapping("/m2/t2")
//    public void test3(HttpServletRequest req,HttpServletResponse rsp) throws IOException {
//        rsp.sendRedirect("/springmvc03/index.jsp");
//    }


//    @RequestMapping("/m2/t3")
//    public void test3(HttpServletRequest req, HttpServletResponse rsp) throws Exception {
//        // 转发
//        req.setAttribute("msg","/result/t3");
//        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,rsp);
//    }


}
