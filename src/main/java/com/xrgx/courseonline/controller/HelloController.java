package com.xrgx.courseonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    @RequestMapping({"/", "/index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("/goLogin")
    public String go() {
        return "login";
    }
}
