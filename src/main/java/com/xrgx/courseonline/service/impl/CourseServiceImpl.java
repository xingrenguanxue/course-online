package com.xrgx.courseonline.service.impl;

import com.xrgx.courseonline.domain.Course;
import com.xrgx.courseonline.mapper.CourseMapper;
import com.xrgx.courseonline.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> findAll() {
        List<Course> list = courseMapper.findAll();
        System.out.println(list);
        return list;
    }

    @Override
    public void selectCourse(String cid, String sid) {
        courseMapper.insertSelection(cid, sid);
    }

    @Override
    public void deleteCourse(String cid, String sid) {
        courseMapper.deleteSelection(cid, sid);
    }
}
