package com.xrgx.courseonline.service.impl;

import com.xrgx.courseonline.domain.Teacher;
import com.xrgx.courseonline.mapper.TeacherMapper;
import com.xrgx.courseonline.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher findTeacher(String tid) {
        return teacherMapper.findTeacherByTid(tid);
    }
}
