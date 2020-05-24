package com.xrgx.courseonline.controller;

import com.xrgx.courseonline.domain.Student;
import com.xrgx.courseonline.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentServiceImpl;

    @PostMapping("/student/login")
    public String login(@RequestParam("id") String id,
                        @RequestParam("password") String password,
                        Map<String, Object> msgMap, HttpSession session) {
        Student loginStu = studentServiceImpl.login(id, password);
        System.out.println(loginStu);
        if (loginStu != null) {
            session.setAttribute("loginStu", loginStu);
            return "welcome";
        }
        else {
            msgMap.put("msg", "用户名或密码错误");
            return "login";
        }
    }
}
