package com.xrgx.courseonline.mapper;

import com.xrgx.courseonline.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StudentMapper {

    Student findStuByUsrAndPwd(String id, String password);

    int changPwdByIdAndPwd(String sid, String oldPwd, String newPwd);
}
