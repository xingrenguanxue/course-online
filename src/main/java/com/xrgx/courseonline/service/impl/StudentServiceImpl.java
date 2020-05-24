package com.xrgx.courseonline.service.impl;

import com.xrgx.courseonline.domain.Student;
import com.xrgx.courseonline.mapper.StudentMapper;
import com.xrgx.courseonline.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student login(String id, String password) {
        return studentMapper.findStuByUsrAndPwd(id, password);
    }
}
