package com.xrgx.courseonline.controller;

import com.xrgx.courseonline.domain.Student;
import com.xrgx.courseonline.listener.CountListener;
import com.xrgx.courseonline.service.CourseService;
import com.xrgx.courseonline.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        loginStu.setSpwd("*******");
        System.out.println(loginStu);
        if (loginStu != null) {
            session.setAttribute("loginStu", loginStu);
            //不使用重定向则会导致登录拦截校验出问题，由于使用重定向，所以需要给welcome.html设置视图映射
            return "redirect:/welcome.html";
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
                            Map<String, Object> msgMap,
                            HttpSession session) {
        System.out.println(sid + "--" + oldPwd + "--"+newPwd);
        boolean flag = studentServiceImpl.changePwd(sid, oldPwd, newPwd);
        if (flag) {
            msgMap.put("msg", "修改成功，请重新登录");
            session.invalidate();
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

    @RequestMapping("/student/getNum")
    public String getOnlineNum(Model model) {
        int num = CountListener.getNum();
        System.out.println(num);
        model.addAttribute("num", num);
        return "welcome";
    }


}
