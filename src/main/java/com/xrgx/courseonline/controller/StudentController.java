package com.xrgx.courseonline.controller;

import com.xrgx.courseonline.domain.Student;
import com.xrgx.courseonline.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @PostMapping("/student/changePwd")
    public String changePwd(@RequestParam("sid") String sid,
                            @RequestParam("oldPwd") String oldPwd,
                            @RequestParam("newPwd") String newPwd,
                            Map<String, Object> msgMap) {
        boolean flag = studentServiceImpl.changePwd(sid, oldPwd, newPwd);
        if (flag) {
            msgMap.put("msg", "修改成功，请重新登录");
            return "login";
        } else {
            msgMap.put("msg", "修改失败，请再次尝试");
            return "alter";
        }
    }

    @RequestMapping("/student/exit")
    public String exit(HttpSession session) {
        session.invalidate();
        return "index";
    }


}
