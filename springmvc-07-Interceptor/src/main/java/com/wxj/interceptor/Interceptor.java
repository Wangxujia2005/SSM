package com.wxj.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor implements HandlerInterceptor {
    //在请求处理之前执行
    //如果返回true执行下一个拦截器
    //如果返回false就不执行下一个拦截器
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
        System.out.println("Interceptor...preHandle  也就是处理前");
        return true;
    }

    //在请求处理方法之后执行
    public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView model) throws Exception {
        System.out.println("Interceptor...postHandle  也就是处理后");
    }

    //在dispatcherServlet处理后执行，做清理工作
    public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler, Exception ex) throws Exception {
        System.out.println("Interceptor...afterCompletion  也就是清理工作");
    }
}
