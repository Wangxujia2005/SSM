package com.wxj.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.wxj.pojo.User;
import com.wxj.util.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RestController
public class UserController {
    @RequestMapping("/json")
    @ResponseBody
    /*
    @ResponseBody 注解用于 SpringMVC 控制器的方法上，
    表示该方法的返回值会直接作为 HTTP 响应体输出，
    而不是跳转到某个视图（如 JSP 页面）。
    常用于返回 JSON、XML 或纯文本数据。
     */
    public String json1() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("wxj",18,"女");
        //将对象解析成为json格式
        String str = mapper.writeValueAsString(user);
        //由于@ResponseBody的存在，不会走视图解析器，而是直接将字符串响应到浏览器
        // 由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
        return str;
    }
    /*
    在类上直接使用 @RestController ，这样子，里面所有的方法都只会返回 json 字符串了，
    不用再每一个都添加@ResponseBody ！
    我们在前后端分离开发中，一般都使用 @RestController ，十分便捷！
     */

    @RequestMapping("/json2")
    public String json2() throws JsonProcessingException {
        // 创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();

        // 创建一个对象
        User user = new User("哇哈哈1号", 20, "man");
        User user2 = new User("哇哈哈2号", 19, "woman");
        User user3 = new User("哇哈哈3号", 22, "man");
        User user4 = new User("哇哈哈4号", 21, "woman");
        List<User> list = new ArrayList<User>();
        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        // 将对象解析成json格式
        String str = mapper.writeValueAsString(list);
        return str;
    }

    @RequestMapping("/json3")
    public String json3() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        // 创建时间一个对象，java.util.Date
        Date date = new Date();
        // 将对象解析成json格式
        String str = mapper.writeValueAsString(date);
        return str;
    }

    @RequestMapping("/json4")
    public String json4() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        // 不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        // 自定义日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 设置指定日期格式
        mapper.setDateFormat(sdf);

        Date date = new Date();
        String str = mapper.writeValueAsString(date);
        return str;
    }

    @RequestMapping("/json5")
    public String json5(){
        Date date = new Date();
        String json = JsonUtils.getJson(date);
        return json;
    }
}
