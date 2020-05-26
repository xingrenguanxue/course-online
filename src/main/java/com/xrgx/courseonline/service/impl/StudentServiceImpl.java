package com.xrgx.courseonline.service.impl;

import com.xrgx.courseonline.domain.Student;
import com.xrgx.courseonline.mapper.StudentMapper;
import com.xrgx.courseonline.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student login(String id, String password) {
        return studentMapper.findStuByUsrAndPwd(id, password);
    }

    @Override
    public boolean changePwd(String sid, String oldPwd, String newPwd) {

        int i = studentMapper.changPwdByIdAndPwd(sid, oldPwd, newPwd);
        System.out.println(i);
        if (i == 1)
            return true;
        return false;
    }
}
