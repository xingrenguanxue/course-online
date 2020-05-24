package com.xrgx.courseonline.service;

import com.xrgx.courseonline.domain.Student;
import org.springframework.stereotype.Service;

public interface StudentService {

    Student login(String id, String password);

    boolean changePwd(String sid, String oldPwd, String newPwd);
}
