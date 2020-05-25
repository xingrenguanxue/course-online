package com.xrgx.courseonline.mapper;

import com.xrgx.courseonline.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {
    Teacher findTeacherByTid(String tid);
}
