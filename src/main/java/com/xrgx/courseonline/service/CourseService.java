package com.xrgx.courseonline.service;

import com.xrgx.courseonline.domain.Course;

import java.util.Collection;
import java.util.List;

public interface CourseService {

    //查询所有课程
    List<Course> findAll();

    //选课
    void selectCourse(String cid, String sid);

    //退课
    void deleteCourse(String cid, String sid);

    //查看已选课程
    List<Course> getSelection(String sid);

}
