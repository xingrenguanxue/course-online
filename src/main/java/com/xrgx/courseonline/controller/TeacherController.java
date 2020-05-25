package com.xrgx.courseonline.controller;

import com.xrgx.courseonline.domain.Teacher;
import com.xrgx.courseonline.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherServiceImpl;

    //获取教师信息
    @RequestMapping("/teacher/{tid}")
    public String showTeacherInfo(@PathVariable("tid") String tid, Model model) {
        Teacher teacher = teacherServiceImpl.findTeacher(tid);
        model.addAttribute("teacherInfo", teacher);
        return "showTeacher";

    }
}
