package com.xrgx.courseonline.controller;


import com.xrgx.courseonline.domain.Course;
import com.xrgx.courseonline.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseServiceImpl;


    //显示所有课程
    @RequestMapping("/course/showAll")
    public String showAllCourse(Model model) {
        List<Course> courseList = courseServiceImpl.findAll();
        model.addAttribute("courseList", courseList);
//        String courseString = courseList.toString();
//        System.out.println(courseString);
        return "course";
    }

    //选课
    @PostMapping("/course/{cid}/{sid}")
    public void select(@PathVariable("cid") String cid,
                         @PathVariable("sid") String sid) {
        System.out.println(cid +"se" + sid);
        courseServiceImpl.selectCourse(cid, sid);

    }

    //退课
    @DeleteMapping("/course/{cid}/{sid}")
    public void delete(@PathVariable("cid") String cid,
                       @PathVariable("sid") String sid) {
        System.out.println(cid +"de" + sid);
        courseServiceImpl.deleteCourse(cid, sid);
    }

    @RequestMapping("/course/showSelection/{sid}")
    public String showSelection(@PathVariable("sid") String sid, Model model) {
        List<Course> selection =  courseServiceImpl.getSelection(sid);
        model.addAttribute("selection", selection);
        return "showSelection";
    }

}
