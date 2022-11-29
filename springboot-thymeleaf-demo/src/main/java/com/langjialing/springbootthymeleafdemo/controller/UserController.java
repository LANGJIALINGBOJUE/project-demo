package com.langjialing.springbootthymeleafdemo.controller;

import com.langjialing.springbootthymeleafdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Map;

/**
 * @author 郎家岭伯爵
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/t1")
    public String test1(Model model) {
        //classpath:/templates/test.html

        //存入数据
        model.addAttribute("msg","Hello,Thymeleaf");
        return "Test";

    }

    @RequestMapping("/t2")
    public String test2(Map<String,Object> map){
        //存入数据
        map.put("msg","<h1>Hello</h1>");
        map.put("users", Arrays.asList("郎家岭伯爵","LANGJIALINGBOJUE"));
        //classpath:/templates/test.html
        return "test";
    }

    @RequestMapping("/t3")
    public ModelAndView test3(){
        ModelAndView modelAndView = new ModelAndView();
        // 设置跳转的视图，即位于 templates/User.html
        modelAndView.setViewName("User");
        modelAndView.addObject("title", "Thymeleaf 使用");
        modelAndView.addObject("desc", "Spring Boot 整合 Thymeleaf");

        User author = new User(1, "郎家岭伯爵", "123456", 20);
        modelAndView.addObject("author", author);

        return modelAndView;
    }
}