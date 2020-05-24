package com.xrgx.courseonline.mapper;

import com.xrgx.courseonline.domain.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

    Student findStuByUsrAndPwd(String id, String password);
}
