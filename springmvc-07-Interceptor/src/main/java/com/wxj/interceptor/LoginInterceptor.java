package com.wxj.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception{
        //如果是登录页面则放行
        System.out.println("uri: "+req.getRequestURI());
        if(req.getRequestURI().contains("login")){
            return true;
        }

        HttpSession session = req.getSession();

        //如果用户已经登录也放行
        if(session.getAttribute("user")!=null){
            return true;
        }

        //用户没有登录跳转登录页面
        req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, res);
        return false;
    }

    public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, org.springframework.web.servlet.ModelAndView model) throws Exception{

    }

    public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler, Exception ex) throws Exception{

    }
}
